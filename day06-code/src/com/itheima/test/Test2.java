package com.itheima.test;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = makeRandomArray(10);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int maxElement = getMaxElement(arr);
        System.out.println();
        System.out.println("the max element is:" + maxElement);
    }

    public static int getMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] makeRandomArray(int length) {
        int[] arr = new int[length];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        return arr;
    }
}
