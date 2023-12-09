package com.itheima.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        int[] arr1 = makeRandomArray(10);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        int[] arr2 = copyOfRange(arr1, 1, 8);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static int[] makeRandomArray(int length) {
        int[] arr = new int[length];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        return arr;
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] arr2 = new int[to - from];
        for (int i = 0; i < arr2.length; i++,from++) {
            arr2[i]=arr[from];
        }
//        for (int i = from; i < to; i++) {
//            arr2[i - from] = arr[i];
//        }
        return arr2;
    }
}
