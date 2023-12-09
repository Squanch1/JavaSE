package com.itheima.test;

import java.util.Scanner;

/**
 * version2(使用数组存储每一位上的数字)
 * 数字加密
 */

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digits = judgeDigits(number);
        int[] arr = new int[digits];
        for (int i = 0; i < arr.length; i++) {
            arr[arr.length-1-i] = number % 10;
            number/=10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int judgeDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

}
