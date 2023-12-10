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
        int encryptedPassword = 0;
        for (int i = 0; i < arr.length; i++) {
            int digit = number % 10;
            arr[arr.length - 1 - i] = (digit + 5) % 10;
            number /= 10;
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            encryptedPassword = encryptedPassword * 10 + arr[i];
        }
        System.out.println(encryptedPassword);
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
