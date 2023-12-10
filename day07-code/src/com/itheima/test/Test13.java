package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

/**
 * version1
 * 双色球系统的模拟实现
 */
public class Test13 {
    public static void main(String[] args) {
        int[] redBall = new int[6];
        setBall(redBall,33);

        int[] blueBall = new int[1];
        setBall(blueBall,16);

        System.out.println("请输入你购买的双色球号码");
        int[] purchaseRedBall = new int[6];
        int[] purchaseBlueBall = new int[1];
        purchaseBall(purchaseRedBall, 33);
        purchaseBall(purchaseBlueBall, 16);

        System.out.println("您购买的红球号码为");
        printArr(purchaseRedBall);
        System.out.println("您购买的蓝球号码为");
        printArr(purchaseBlueBall);

        System.out.println("本次双色球的红球号码为");
        printArr(redBall);
        System.out.println("本次双色球的蓝球号码为");
        printArr(blueBall);

        redeem(redBall, blueBall, purchaseRedBall, purchaseBlueBall);

    }

    public static void redeem(int[] redBall, int[] blueBall, int[] purchaseRedBall, int[] purchaseBlueBall) {
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < purchaseRedBall.length; i++) {
            boolean flag = ifContain(redBall, purchaseRedBall[i]);
            if (flag) {
                redCount++;
            }
        }
        for (int i = 0; i < purchaseBlueBall.length; i++) {
            boolean flag = ifContain(redBall, purchaseRedBall[i]);
            if (flag) {
                blueCount++;
            }
        }
        System.out.println("您中了"+redCount+"个红球");
        System.out.println("您中了"+blueCount+"个蓝球");
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你获得一等奖最高1000W奖金!");
        } else if (redCount == 6) {
            System.out.println("恭喜你获得二等奖最高500W奖金!");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你获得三等奖3000元奖金!");
        } else if (redCount == 5 || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你获得四等奖200元奖金!");
        } else if (redCount == 4 || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你获得五等奖10元奖金!");
        } else if (blueCount == 1) {
            System.out.println("恭喜你获得六等奖5元奖金!");
        } else {
            System.out.println("很遗憾你没有中奖");
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArr(int number) {
        System.out.println(number);
    }

    public static void setBall(int[] arr,int bound) {
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int number = r.nextInt(bound) + 1;
            boolean flag = ifContain(arr, number);
            if (!flag) {
                arr[i] = number;
                i++;
            }
        }
    }

    public static void purchaseBall(int[] arr, int bound) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            int number = sc.nextInt();
            if (number >= 1 && number <= bound) {
                boolean flag = ifContain(arr, number);
                if (!flag) {
                    arr[i] = number;
                    i++;
                } else {
                    System.out.println("当前号码已存在,请重新输入!");
                }
            } else {
                System.out.println("输入的号码不合法!请重新输入!");
            }
        }
    }

    public static boolean ifContain(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
