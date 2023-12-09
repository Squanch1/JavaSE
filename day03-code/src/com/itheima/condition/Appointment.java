package com.itheima.condition;

import java.util.Scanner;

public class Appointment {
    public static void main(String[] args) {
        int maleVogue = 0;
        int femaleVogue = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your clothes vogue degree");

        maleVogue = sc.nextInt();
        System.out.println("please enter your date clothes vogue degree");

        femaleVogue = sc.nextInt();
//        System.out.println("please enter your clothes vogue degree");
//        if (sc.nextInt() >= 0 && sc.nextInt() <= 10) {
//            maleVogue = sc.nextInt();
//        }
//        System.out.println("please enter your date clothes vogue degree");
//        if (sc.nextInt() >= 0 && sc.nextInt() <= 10) {
//            femaleVogue = sc.nextInt();
//        }

//         if (maleVogue > femaleVogue) {
//             System.out.println("true");
//         } else {
//             System.out.println("false");
//         }
        System.out.println(maleVogue > femaleVogue);

    }
}
