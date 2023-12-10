package com.itheima.test;

import java.util.Scanner;

/**
 * version2.2(使用数组且使用数组逆序的数字解密)
 * 数字解密
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入加密后的数字");
        int encryptedNumber = sc.nextInt();
        int digits = getDigits(encryptedNumber);
        int[] arr = getArr(digits, encryptedNumber);
        reverseArr(arr);
        int number = getNumber(arr);
        System.out.println(number);
    }
    private static void reverseArr(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    private static int getNumber(int[] arr) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];
        }
        return number;
    }
    private static int[] getArr(int digits, int encryptedNumber) {
        int[] arr = new int[digits];
        for (int i = 0; i < arr.length; i++) {
            int digit = encryptedNumber % 10;
            if (digit >= 0 && digit <= 4) {
                digit = digit + 10 - 5;
            } else {
                digit -= 5;
            }
            arr[arr.length - 1 - i] = digit;
            encryptedNumber /= 10;
        }
        return arr;
    }
    private static int getDigits(int encryptedNumber) {
        int digits = 0;
        while (encryptedNumber != 0) {
            encryptedNumber /= 10;
            digits++;
        }
        return digits;
    }
}

