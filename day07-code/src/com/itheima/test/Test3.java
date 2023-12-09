package com.itheima.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i < 26) {
                arr[i] = (char) (65 + i);
            } else {
                arr[i] = (char) (97 + i - 26);
            }
        }
//        for (int i = 65, index = 0; i < 91; i++) {
//            arr[index] = (char) i;
//            index++;
//        }
//        for (int i = 97, index = 26; i < 122; i++) {
//            arr[index] = (char) i;
//            index++;
//        }
        Random r = new Random();
        String verificationCode = "";
        for (int i = 0; i < 4; i++) {
            verificationCode += arr[r.nextInt(arr.length)];
        }
        verificationCode += r.nextInt(10);
        System.out.println(verificationCode);
    }
}
