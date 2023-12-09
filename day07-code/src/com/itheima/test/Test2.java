package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = isPrime(i);
            if (flag) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("一共有"+count+"个质数");
    }

    public static boolean isPrime(int i) {
        boolean flag = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                flag = false;
                //一旦确定是质数,就可以跳出该循环,没必要继续判断.
                break;
            }
        }
        return flag;
    }
}
