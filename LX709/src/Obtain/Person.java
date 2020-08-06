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


public class Person {

    private String name;
    private String sex;
    private int age;
    Properties properties=new Properties();

    public Person(String name, String sex, int age, Properties properties) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.properties = properties;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Person() {
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println("人在吃饭");
    }
    public void sleep(){
        System.out.println(getName()+"还在睡觉");
    }
}
