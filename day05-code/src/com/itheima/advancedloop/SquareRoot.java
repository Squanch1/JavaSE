package com.itheima.advancedloop;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i * i == number) {
                System.out.println(i + "是" + number + "的平方根");
                break;
            } else if (i * i > number) {
                System.out.println(i - 1 + "是" + number + "平方根的整数部分");
                break;
            }
        }
    }
}
