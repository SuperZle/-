package Obtain;

import java.io.Serializable;
import java.util.Properties;

/**
 * Administrator
 * current user 张++
 * 2020/7/9 0009
 * current system date
 * 18:20
 * current system time
 * 2020
 * current year
 */


public class Cat {
    private String name;
    private String colour;
    private int age;
    Properties properties=new Properties();


    public Cat() {
    }

    public Cat(String name, String colour, int age, Properties properties) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println(getColour()+getName()+"在吃饭");
    }
    public void sleep(){
        System.out.println(getColour()+"猫还在睡觉");
    }
}
