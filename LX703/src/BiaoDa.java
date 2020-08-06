import java.util.Arrays;
import java.util.Comparator;

/**
 * Administrator
 * current user 张++
 * 2020/7/10 0010
 * current system date
 * 14:02
 * current system time
 * 2020
 * current year
 */


public class BiaoDa {
    public static void main(String[] args) {

        Person[] people=new Person[]{
                new Person("华仔",32),
                new Person("阿华",25),
                new Person("阿岚",28),
                new Person("阿花",22)
        };

        //按年龄排序  1.0
        /*Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });*/

        //2.0
        /*Arrays.sort(people,(Person o1, Person o2)->{
            return -o1.getAge()+o2.getAge();
        });*/
        //3.0
        /*Arrays.sort(people,((o1, o2) -> {
            return o1.getAge()-o2.getAge();
        }));*/
        //4.0
        Arrays.sort(people,(o1, o2)-> o1.getAge()-o2.getAge());

        System.out.println(Arrays.toString(people));



    }

}
