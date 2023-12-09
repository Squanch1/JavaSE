package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择是头等舱还是经济舱");
        String str = sc.nextLine();
        System.out.println("请选择输入机票价格");
        double ticket = sc.nextDouble();
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        switch (month) {
            case 5, 6, 7, 8, 9, 10 -> {
                if (str.equals("经济舱")) {
                    System.out.println("当前票价为:" + ticket * 0.85);
                } else if (str.equals("头等舱")) {
                    System.out.println("当前票价为:" + ticket * 0.9);
                } else {
                    System.out.println("飞机票类型输入错误!");
                }
            }
            case 11, 12, 1, 2, 3, 4 -> {
                if (str.equals("经济舱")) {
                    System.out.println("当前票价为:" + ticket * 0.65);
                } else if (str.equals("头等舱")) {
                    System.out.println("当前票价为:" + ticket * 0.7);
                } else {
                    System.out.println("飞机票类型输入错误!");
                }
            }
            default->{
                System.out.println("月份输入有误!");
            }
        }
    }
}

