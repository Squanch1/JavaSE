package com.itheima.opp;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "HUAWEI Mate60 pro";
        phone1.price = 7899.9;
        phone1.size = 14.3;
        System.out.println(phone1.brand);
        System.out.println(phone1.price);
        System.out.println(phone1.size);
        phone1.call();
        phone1.playGame();

    }
}
