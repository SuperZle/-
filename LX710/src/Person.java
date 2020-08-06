/**
 * Administrator
 * current user 张++
 * 2020/7/9 0009
 * current system date
 * 10:46
 * current system time
 * 2020
 * current year
 */

@SuppressWarnings("all")
public class Person {
    private String name;
    public int age;
    private static String s;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    private Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public static String getS() {
        return s;
    }

    public static void setS(String s) {
        Person.s = s;
    }

    public void fun(){
        System.out.println("1");

    }
    protected int fun1(int age){
        System.out.println("2");
        return 3+age;
    }
    public void fun2(){
        System.out.println("3");
    }
    private String fun3(String name, int age){
        System.out.println("4");
        return name+"大帅哥"+age;
    }
    void fun4(){
        System.out.println("ddddddddddd");
    }
}
