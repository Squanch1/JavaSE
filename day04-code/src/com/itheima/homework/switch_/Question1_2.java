package com.itheima.homework.switch_;

import java.util.Scanner;

public class Question1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operatorNumber1 = sc.nextInt();
        int operatorNumber2 = sc.nextInt();
        //清除缓冲区的字符
        sc.nextLine();
        String str = sc.nextLine();
        //Scanner无法直接读取字符类型的数据,可以先用sc.nextLine读取字符串,然后用str.charAt(0)将其转化为字符类型的数据.
        char operator = str.charAt(0);
        switch (operator) {
            case '+':
                System.out.println(operatorNumber1 + operatorNumber2);
                break;
            case '-':
                System.out.println(operatorNumber1 - operatorNumber2);
                break;
            case '*':
                System.out.println(operatorNumber1 * operatorNumber2);
                break;
            case '/':
                System.out.println(operatorNumber1 / operatorNumber2);
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
