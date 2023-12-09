package com.itheima.advancedloop;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber2 {
    public static void main(String[] args) {
        //生成1-100的随机数
        Random r = new Random();
        int random = r.nextInt(100) + 1;
        System.out.println("随机数是" + random);
        int count = 0;
        int guess=0;
        //多考虑死循环的应用场景;如果猜数字游戏就可以用到死循环->如果用得到break语句就应该能用到死循环
        while (guess!=random) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter the number you guess");
            guess = sc.nextInt();
            count++;
            if (count >= 3) {
                System.out.println("Congratulation! You are god damn right");
                break;
            }
            if (guess == random) {
                System.out.println("Congratulation! You are god damn right");
            } else if (guess >= random) {
                System.out.println("Too big!");
            } else {
                System.out.println("Too small!");
            }

        }

    }


}
