package com.itheima.test;

import java.util.Scanner;

/**
 * version2.1(使用数组但不使用数组逆序的数字解密)
 * 数字解密
 * 特别注意如果使用到了复合赋值运算符,会改变变量的初始值
 * 当你需要多次使用该变量的时候
 * 就需要在第一次使用前对其拷贝,以便下次使用
 * 但是如果在方法中,而且是传值调用就不会出现这种问题.
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入加密后的数字");
        int encryptedNumber = sc.nextInt();
        int copy = encryptedNumber;
        int number = 0;
        int digits = 0;
        while (encryptedNumber != 0) {
            encryptedNumber /= 10;
            digits++;
        }
        encryptedNumber = copy;
        int[] arr = new int[digits];
        for (int i = 0; i < arr.length; i++) {
            int digit = encryptedNumber % 10;
            if (digit >= 0 && digit <= 4) {
                digit = digit + 10 - 5;
            } else {
                digit -= 5;
            }
            arr[i] = digit;
            encryptedNumber /= 10;
        }
        for (int i = 0; i < arr.length; i++) {
            number = number*10+arr[i];
        }
        System.out.println(number);
    }
}
