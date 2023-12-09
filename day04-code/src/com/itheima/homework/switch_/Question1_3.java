package com.itheima.homework.switch_;

import java.util.Scanner;

public class Question1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        char operator = str.charAt(0);
        switch (operator){
            //JDK12允许用->和{}代替:和break;
            //case后面的字面量必须互不相同
            case '+'-> System.out.println(number1+number2);
            case '_'-> System.out.println(number1-number2);
            case '*'-> System.out.println(number1*number2);
            case '/'-> System.out.println(number1/number2);
            default-> System.out.println("输入错误");

        }
    }
}
