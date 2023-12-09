package com.itheima.condition;

import java.util.Scanner;

public class NewFeatureOfSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
//        switch (number) {
//            case 1 -> {
//                System.out.println("输入一");
//            }//如果大括号只有一句,大括号可以省略,创建变量并且初始化算两句.
//            case 2 -> {
//                System.out.println("输入二");
//            }
//            case 3 -> {
//                System.out.println("输入三");
//            }
//            default ->{
//                System.out.println("输入的数字不是1/2/3");
//            }
        switch (number) {
            //如果大括号只有一句,大括号可以省略,创建变量并且初始化算两句.int a = 10;不可以在无大括号的情况下使用
            case 1 -> System.out.println("输入一");
            case 2 -> System.out.println("输入二");
            case 3 -> System.out.println("输入三");
            default -> System.out.println("输入的数字不是1/2/3");

        }
    }
}
