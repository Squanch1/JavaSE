package com.itheima.homework;

import java.util.Scanner;

//有序数组里插入数据
public class Question5 {
    public static void main(String[] args) {
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        Scanner sc = new Scanner(System.in);
        int insert = 50;
        int[] arr2 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > 50) {
                int end = arr2.length - 1;
                while (end > i) {
                    arr2[end] = arr2[end - 1];
                    end--;
                }
                arr2[i] = insert;
                break;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
