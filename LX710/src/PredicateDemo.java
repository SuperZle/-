import java.util.ArrayList;
import java.util.Properties;
import java.util.function.Predicate;

/**
 * Administrator
 * current user 张++
 * 2020/7/10 0010
 * current system date
 * 16:50
 * current system time
 * 2020
 * current year
 */


public class PredicateDemo {
    public static void main(String[] args) {
        String s="时代风范反反复复方法方法三";
        boolean fun = fun(s, s1 -> s1.length() > 12);
        System.out.println(fun);

        ArrayList<Person> arrayList=new ArrayList();
        ArrayList<Person> arrayList1=new ArrayList();

        arrayList.add(new Person("小米",15));
        arrayList.add(new Person("小爱",16));
        arrayList.add(new Person("阿鸭",8));
        arrayList.add(new Person("阿花",13));
        arrayList.add(new Person("小的",5));
        for (Person p:arrayList
             ) {
            if (fun1(p,a->a.getAge()>10,a->a.getName().contains("阿"))){
            arrayList1.add(p);
            }
        }

        System.out.println(arrayList);
        System.out.println(arrayList1);
    }
    public static boolean fun(String s, Predicate<String> predicate){
        return predicate.test(s);
    }


    public static boolean fun1(Person person, Predicate<Person> p1,Predicate<Person> p2){
        return p1.and(p2).test(person);
    }


}
