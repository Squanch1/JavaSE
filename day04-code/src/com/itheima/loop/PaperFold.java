package com.itheima.loop;

public class PaperFold {
    public static void main(String[] args) {
        double height = 8844.43;
        int count = 0;
//        for(double thickness=1e-4;thickness<height;thickness*=2){
//            count++;
//        }
//        System.out.println(count);
        double thickness = 1e-4;
        while (thickness < height) {
            thickness *= 2;
            count++;
        }
        System.out.println(count);
    }
}
