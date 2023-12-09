package com.itheima.condition;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int number1 = scanner.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = scanner.nextInt();
        System.out.println(number1 == 6 || number2 == 6 || ((number1 + number2) % 6 == 0));
    }
}
