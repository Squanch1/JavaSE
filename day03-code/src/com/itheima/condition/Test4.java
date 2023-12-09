package com.itheima.condition;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight1 = scanner.nextInt();
        int weight2 = scanner.nextInt();
        String str = weight1 == weight2 ? "相等" : "不相等";
        System.out.println(str);
    }
}
