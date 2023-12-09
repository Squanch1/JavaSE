package com.itheima.homework.loop;

public class Question3 {
    public static void main(String[] args) {
        int count = 0;
        double height = 8844.43;
        double thickness = 1e-4;
        while (thickness <= height) {
            count++;
            thickness *= 2;
        }
        System.out.println(count);
    }
}
