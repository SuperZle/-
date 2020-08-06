import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Administrator
 * current user 张++
 * 2020/7/9 0009
 * current system date
 * 14:51
 * current system time
 * 2020
 * current year
 *      方法
 */


public class FanShe2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //
        Class fClass=Class.forName("Person");

        //获取公共的方法  包含父类的Object
        Method[] methods = fClass.getMethods();
        for (Method m :methods
                    ){
            System.out.println(m);
        }
        //获取全部的自己的方法
        Method[] declaredMethods = fClass.getDeclaredMethods();
        for (Method m1:declaredMethods
             ) {
            System.out.println(m1);
        }

        Person person =(Person) fClass.newInstance();

        //获取特定的方法
        Method fun = fClass.getMethod("fun");
        fun.invoke(person);

        //f

        Method fun3 = fClass.getDeclaredMethod("fun3", String.class, int.class);

        //调用方法
        fun3.setAccessible(true);
        //获取返回值
        Object 大曹 = fun3.invoke(person, "大曹", 18);
        System.err.println(大曹);

        Method fun1 = fClass.getDeclaredMethod("fun1",int.class);
        fun1.setAccessible(true);
        Object invoke = fun1.invoke(person, 18);
        System.out.println(invoke);



    }
}
