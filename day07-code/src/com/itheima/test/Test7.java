package com.itheima.test;

import java.util.Scanner;

/**
 * version1(不使用数组完成数字解密)
 * 数字解密
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入加密后的数字");
        int encryptedNumber = sc.nextInt();
        int number = 0;
        while (encryptedNumber != 0) {
            int digit = encryptedNumber % 10;
            if (digit >= 0 && digit <= 4) {
                digit = digit + 10 - 5;
            } else {
                digit = digit - 5;
            }
            number = number * 10 + digit;
            encryptedNumber /= 10;
        }
        System.out.println("加密前的数字是" + number);
    }
}
