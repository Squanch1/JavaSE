package com.itheima.homework;

import java.util.Random;

public class Question3 {
    public static void main(String[] args) {
        int sum = 0;
        Random r = new Random();
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) ;
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
