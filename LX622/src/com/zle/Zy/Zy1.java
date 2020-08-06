package com.zle.Zy;

public class Zy1 {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Zy1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Zy1() {
    }

    static {
        System.out.println("我是父类静态代码块");
    }
    {
        System.out.println("我是父类普通代码块");
    }
    public  void fun(){
        System.out.println("^^^^^^^^^^^^^^");
    }

}
