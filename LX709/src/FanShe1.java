import java.lang.reflect.Field;
import java.util.concurrent.Callable;

/**
 * Administrator
 * current user 张++
 * 2020/7/9 0009
 * current system date
 * 13:55
 * current system time
 * 2020
 * current year
 *   获取属性
 */


public class FanShe1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        //反射获取属性  创建
        Class fClass=Class.forName("Person");
        //只能找public
        Field[] fields = fClass.getFields();
        for (Field f:fields
             ) {
            System.out.println(f);
        }

        //找全部
        Field[] declaredFields = fClass.getDeclaredFields();
        for (Field f1:declaredFields
             ) {
            System.out.println(f1);
        }

        //用反射创建一个人
        Person person = (Person)fClass.newInstance();

        //设置名字  获取特定的
        Field age = fClass.getField("age");
        age.set(person,19);
        System.out.println(age.get(person));
        //设置名字
        Field name = fClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person,"德律风根");
        System.out.println(name.get(person));



    }
}
