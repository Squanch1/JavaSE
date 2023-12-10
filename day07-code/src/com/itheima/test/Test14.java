package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

/**
 * version2
 * 双色球系统的模拟实现
 */
public class Test14 {
    public static void main(String[] args) {
        int[] setNumber = setNumber();
        for (int i = 0; i < setNumber.length; i++) {
            System.out.print(setNumber[i] + " ");
        }
        System.out.println();
        int[] guessNumber = guessNumber();
        for (int i = 0; i < guessNumber.length; i++) {
            System.out.print(guessNumber[i] + " ");
        }
        System.out.println();
        redeem(setNumber,guessNumber);
    }
    public static void redeem(int[] setNumber,int[] guessNumber){
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < guessNumber.length-1; i++) {
            boolean flag = whetherContain(guessNumber, setNumber[i]);
            if(flag){
                redCount++;
            }
        }
        System.out.println("红球中奖个数为"+redCount);
        if(guessNumber[guessNumber.length-1] == setNumber[setNumber.length-1]){
            blueCount++;
        }
        System.out.println("蓝球中奖个数为"+blueCount);
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

    public static int[] setNumber() {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < arr.length - 1; ) {
            int number = r.nextInt(33) + 1;
            boolean flag = whetherContain(arr, number);
            //对随机生成的号码检验
            if (!flag) {
                arr[i] = number;
                i++;
            }
        }
        arr[arr.length - 1] = r.nextInt(16) + 1;
        return arr;
    }

    public static int[] guessNumber() {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length - 1; ) {
            System.out.println("请输入第" + (i + 1) + "个红球的号码");
            int guess = sc.nextInt();
            boolean flag = whetherContain(arr, guess);
            if (guess >= 1 && guess <= 33) {
                if (!flag) {
                    arr[i] = guess;
                    i++;
                } else {
                    System.out.println("当前输入的红球号码有重复,请重新输入");
                }
            } else {
                System.out.println("当前输入的红球号码不合法!");
            }
        }
        while (true) {
            System.out.println("请输入蓝球的号码");
            int guess = sc.nextInt();
            if (guess >= 1 && guess <= 16) {
                arr[arr.length - 1] = guess;
                break;
            } else {
                System.out.println("当前输入的蓝球号码不合法!");
            }
        }
        return arr;
    }

    public static boolean whetherContain(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }
}
