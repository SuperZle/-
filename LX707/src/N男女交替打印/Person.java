package N男女交替打印;

/**
 * current user 张++
 * 2020/7/13 0013
 * 11:04
 * 2020
 */


public class Person {
    private String name;
    private int age;
    private String nn;
    boolean b=true;

    public String getNn() {
        return nn;
    }

    public void setNn(String nn) {
        this.nn = nn;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                '}';
    }


}
