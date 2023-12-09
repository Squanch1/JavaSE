package com.itheima.homework.loop;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        int sum = 0;
        for (int i = number1; i <= number2; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
