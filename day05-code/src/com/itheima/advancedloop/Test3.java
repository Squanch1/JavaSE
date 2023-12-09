package com.itheima.advancedloop;

public class Test3 {
    public static void main(String[] args) {
//        我是注释
        int number = 71;
        for (int i =2; i*i <= number; i++) {
            if(number%i==0)
            {
                System.out.println(number+"不是质数");
                break;
            }
        }
    }
}
