package N男女混合生产;

/**
 * Administrator
 * current user 张++
 * 2020/7/7 0007
 * current system date
 * 18:05
 * current system time
 * 2020
 * current year
 */


public class Person {

    private String name;
    private String sex;
    private  int age;

    public Person() {
    }

    public Person(String name,String sex, int age) {
        this.name = name;
        this.sex=sex;
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
}
