package com.itheima.homework;

public class Question2 {
    public static void main(String[] args) {
        //double[] arr= new double[]{12.9,53.54,75.0,99.1,3.14};
        //化简之后的数组静态初始化
        double[] arr={12.9,53.54,75.0,99.1,3.14};
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min =arr[i];
            }
        }
        System.out.println(min);
    }
}
