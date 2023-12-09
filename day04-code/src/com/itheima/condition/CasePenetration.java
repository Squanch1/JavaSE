package com.itheima.condition;

import java.util.Scanner;

public class CasePenetration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the week");
        int week = scanner.nextInt();
//        //version 1(case penetration)
//        switch (week) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("工作日");
//                break;
//            case 6:
//            case 7:
//                System.out.println("休息日");
//                break;
//            default:
//                System.out.println("illegal week!");
//                break;
//        }

//
//        //version 2(相同的执行语句可以用逗号并列)
//        switch (week) {
//            case 1, 2, 3, 4, 5:
//                System.out.println("工作日");
//                break;
//            case 6, 7:
//                System.out.println("休息日");
//                break;
//            default:
//                System.out.println("illegal week!");11
//                break;
//        }

//        //version 3(利用jdk11以上的case new feature)
//        switch (week) {
//            case 1, 2, 3, 4, 5 -> {
//                System.out.println("工作日");
//            }
//            case 6, 7 -> {
//                System.out.println("休息日");
//            }
//            default -> {
//                System.out.println("illegal week!");
//            }
//        }
        //version 4(大括号里只有一句可以省略大括号)
        switch (week) {
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("illegal week!");


        }

    }
}
