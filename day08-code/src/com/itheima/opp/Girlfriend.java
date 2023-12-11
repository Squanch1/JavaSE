package com.itheima.opp;

public class Girlfriend {
    //对于私有化的成员变量都需要有get和set方法
    //可以无脑使用this关键字,只要是成员变量就用this关键来修饰
    //变量优先级满足:  就近原则-->局部变量有优先-->this关键字去修饰成员变量
    private String name;
    private int age;
    private String hairColor;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age == 18) {
            this.age = age;
        } else {
            System.out.println("年龄超出范围");
            System.out.println("请重新输入");
        }

    }

    public int getAge() {
        return this.age;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return this.hairColor;
    }


}
