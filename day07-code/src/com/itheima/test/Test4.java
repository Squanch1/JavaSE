package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        double[] arr = initializeScore();
        //写参数的时候能不写死就不写死,尽量用变量去表示每一个值,提高代码的可维护性  4 --> arr.length-2
        double averageScore = (getSumScore(arr) - getMinScore(arr) - getMaxScore(arr)) / (arr.length-2);
        System.out.println("选手的得分是" + averageScore);
    }

    public static double[] initializeScore() {
        double[] arr = new double[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length;) {
            System.out.println("请输入第 "+(i+1)+" 位评委的打分(0~100)");
            double score = sc.nextDouble();
            //对录入数据进行合法性的校验!!!!
            if (score >= 0.0 & score <= 100.0){
                arr[i]=score;
                i++;
            }
            else{
                System.out.println("当前输入分数不合法!");
            }
        }
        return arr;
    }

    public static double getSumScore(double[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double getMaxScore(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double getMinScore(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
