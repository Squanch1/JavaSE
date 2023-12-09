package com.itheima.advancedloop;

public class Test1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.print("过 ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
