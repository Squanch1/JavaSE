package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

/**
 * 双色球系统的模拟实现
 */
public class Test13 {
    public static void main(String[] args) {
        int[] redBall = new int[6];
        setBall(redBall);
        int[] blueBall = new int[1];
        setBall(blueBall);
        System.out.println("请输入你购买的双色球号码");
        int[] purchaseBall ={1,2,3,4,5,6,7};
        //int[] purchaseBall = new int[7];
        //purchaseBall(purchaseBall);
        System.out.println("您购买的双色球号码为");
        printArr(purchaseBall);
        System.out.println();
        System.out.println("本次双色球号码为");
        printArr(redBall);
        printArr(blueBall);
        redeem(redBall,blueBall,purchaseBall);


    }
    public static  void redeem(int[] redBall,int[] blueBall,int[] Ball){

    }
public static void printArr(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}
    public static void printArr(int number){
        System.out.println(number);
    }

    public static void setBall(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int number = r.nextInt(33) + 1;
            boolean flag = ifContain(arr, number);
            if (!flag) {
                arr[i] = number;
                i++;
            }
        }
    }

    public static void purchaseBall(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length - 1; ) {
            int number = sc.nextInt();
            if (number >= 1 && number <= 33) {
                boolean flag = ifContain(arr, number);
                if (!flag) {
                    arr[i] = number;
                    i++;
                } else {
                    System.out.println("当前红球号码已存在,请重新输入!");
                }
            } else {
                System.out.println("输入的红球号码不合法!请重新输入!");
            }
        }
        for (int i = 0; i < 1;) {
            int number = sc.nextInt();
            if(number>=1&&number<=16){
                arr[arr.length-1]=number;
                i++;
            }else{
                System.out.println("当前输入的蓝球号码不合法,请重新输入");
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
