package com.zle.Zy;

public class Zy2 {
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

    public Zy2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Zy2() {
    }
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (obj == this){
            return true;
        }
        if (obj instanceof Zy2){
            return true;
        }
        if (this.getName().equals(obj)){
            return true;
        }
        return false;
        //return (this == obj);
    }
    static {
        System.out.println("我是子类静态代码块");
    }
    {
        System.out.println("我是子类普通代码块");
    }
    public void fun(){
        System.out.println("我是子类方法");
    }
}
