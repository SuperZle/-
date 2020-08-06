import java.lang.reflect.Constructor;
import java.util.Random;

/**
 * Administrator
 * current user 张++
 * 2020/7/9 0009
 * current system date
 * 10:46
 * current system time
 * 2020
 * current year
 *
 *  获取构造
 * @author Administrator
 */


public class FanShe {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        Random random=new Random();
        int i1=random.nextInt(1000);
        System.err.println(i1);
        double random1 = Math.random();
        System.err.println(random1*100);

        //反射
        Class<Person> c=Person.class;
        System.out.println(c);

        Person person=new Person();
        Class c1 = person.getClass();
        System.out.println(c1);

        //放入地址
        Class c2 =Class.forName("Person");
        System.out.println(c2);


        //类加载
        System.out.println(c.hashCode()==c1.hashCode());
        System.out.println(c.hashCode()==c2.hashCode());

        Constructor[] constructors = c.getConstructors();
        for (Constructor cc:constructors
             ) {
            System.out.println(cc);
        }

        //
        Constructor declaredConstructor = c2.getDeclaredConstructor(int.class);
        System.out.println(declaredConstructor);


        Constructor<Person> constructor = c.getDeclaredConstructor(int.class);
        constructor.setAccessible(true);

        //强制创建私有的
        System.out.println(constructor);


    }
}
