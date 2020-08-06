package Fs文件中读取;

/**
 * current user 张++
 * 2020/7/13 0013
 * 12:28
 * 2020
 */


public class Cat {
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
    public void sleep(){
        System.out.println(getName()+"在睡觉");
    }
}
