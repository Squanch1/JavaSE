package com.itheima.loop;

import java.util.Scanner;

public class Foolish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter dividend");
        int dividend = scanner.nextInt();
        System.out.println("please enter divisor");
        int divisor = scanner.nextInt();
        int temp = dividend;
        int residue = 0;
        int quotient = 0;
        while (temp >= divisor) {
            temp -= divisor;
            quotient++;
        }
        residue = temp;
        System.out.println("quotient is :" + quotient);
        System.out.println("residue is :" + residue);

    }
}
