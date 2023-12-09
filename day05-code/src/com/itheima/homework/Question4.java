package com.itheima.homework;

public class Question4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,9,7};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum * 10 + arr[i];
        }
        System.out.println(sum);
    }
}
