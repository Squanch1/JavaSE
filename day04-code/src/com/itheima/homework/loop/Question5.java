package com.itheima.homework.loop;

public class Question5 {
    public static void main(String[] args) {
        for (int i = 1949; i <= 2019; i++) {
            if ((2019 - i) % 12 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
