class Person{
     String name;
}

public class Fun {
    public static void main(String[] args) {
        Person person = new Person() ;
        person.name="B";
        fun(person);
        System.out.println(person.name);
    }
    public static void fun(Person p){
        p.name = "A";
    }
}
