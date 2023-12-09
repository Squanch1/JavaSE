package com.itheima.homework;

import java.util.Random;
//把一个数组里的奇数放左边,偶数放右边.这个代码冗杂,可读性太低了
public class Question6 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        //循环判断阶段,index位置的数组值都是0
        for (int i = 0, left = 0, right = arr1.length - 1; left <= right; i++) {
            if (arr[i] % 2 != 0) {
                arr1[left] = arr[i];
                left++;
            } else {
                arr1[right] = arr[i];
                right--;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }


    }
}
