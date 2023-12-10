package com.itheima.test;

import java.util.Random;

/**
 * version1(最简单的实现方式)
 * 抽奖的实现方式
 */
public class Test10 {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        messArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"元的奖金被抽出");
        }
    }

    public static void messArr(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

    }
}
