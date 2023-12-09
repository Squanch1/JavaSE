package com.itheima.homework.switch_;

import java.util.Scanner;

public class Question1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operatorNumber1 = sc.nextInt();
        int operatorNumber2 = sc.nextInt();
        sc.nextLine();
        String operator = sc.nextLine();
        switch(operator){
            case "+":
                System.out.println(operatorNumber1+operatorNumber2);
                break;
            case "-":
                System.out.println(operatorNumber1-operatorNumber2);
                break;
            case "*":
                System.out.println(operatorNumber1*operatorNumber2);
                break;
            case "/":
                System.out.println(operatorNumber1/operatorNumber2);
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
