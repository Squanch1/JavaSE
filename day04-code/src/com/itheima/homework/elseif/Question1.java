package com.itheima.homework.elseif;

public class Question1 {
    public static void main(String[] args) {
        double price = 7988;
        boolean flag = price * 0.2 > 1500;
        if (flag) {
            System.out.println("以旧换新");
        } else {
            System.out.println("不以旧换新");
        }
    }
}
