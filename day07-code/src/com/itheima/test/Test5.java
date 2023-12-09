package com.itheima.test;

import java.util.Scanner;
/**
 * version1(不使用数组存储数据)
 * 使用回文数的办法正好可以完美解决这道题
 *数字加密
 * */

public class Test5 {
    public static void main(String[] args) {
        System.out.println("请输入密码");
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();
        int sum = 0;
        while (password != 0) {
            sum = sum * 10 + (password % 10 + 5) % 10;
            password /= 10;
        }
        System.out.println(sum);
    }
}
