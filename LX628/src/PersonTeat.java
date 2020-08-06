import java.util.HashSet;
import java.util.Set;

public class PersonTeat {

    public static void main(String[] args) {
        Set<Person> set=new HashSet();
        set.add(new Person("小米",14));
        set.add(new Person("小号",16));
        set.add(new Person("小强",54));
        set.add(new Person("小红",87));
        System.out.println(set);
        Person person=new Person();
        person.setName("小小");
        person.setAge(12);
        System.out.println(person.hashCode());

    }

}
