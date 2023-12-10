package com.itheima.test;

import java.util.Random;

/**
 * version2(通过再创建一个等长的数组,将抽取到的奖金存到另外一个数组来模拟实现抽奖)
 * 具体细节:可以通过将i++移到if判断中来实现对输入数据的校验.
 * 抽奖的实现方式
 */
public class Test11 {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] arr2 = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < arr2.length;) {
            //变量在哪里能用到,就在哪里创建
            int randomIndex = r.nextInt(arr.length);
            boolean flag = ifContain(arr2, arr[randomIndex]);
            if(!flag) {
                arr2[i] = arr[randomIndex];
                i++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]+"元的奖金被抽出");
        }
    }

    public static boolean ifContain(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
