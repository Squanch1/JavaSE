package com.itheima.homework;

import java.util.Scanner;

public class Question5_redo {
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
            if (arr2[i] > insert) {
                int end = arr2.length - 1;
                while (end > i) {
                    arr2[end] = arr2[end - 1];
                    end--;
                }
                arr2[i] = insert;
                //break用于跳出当前所在循环的(只能跳出一层循环),即使写在if的大括号中,也与if无关,break只会找循环结构,只能搭配loop和switch使用
                break;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
