package com.itheima.homework;

import java.util.Random;

public class Question6Rework {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
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
        int left = 0;
        int right = arr1.length-1;
        //if和while循环切忌嵌套使用,代码会很复杂和混乱,难以分析
        //外层循环控制的是循环次数
        for (int i = 0; i < arr1.length; i++) {
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
