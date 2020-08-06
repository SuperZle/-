import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Administrator
 * current user 张++
 * 2020/7/9 0009
 * current system date
 * 17:56
 * current system time
 * 2020
 * current year
 */


public class AnyAddition {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ArrayList<String> arrayList=new ArrayList<>();
        //类文件
        Class aClass = arrayList.getClass();
        Method add = aClass.getMethod("add", Object.class);
        //调用add方法
        Person person=new Person();
        add.invoke(arrayList, 1);
        add.invoke(arrayList,448);
        add.invoke(arrayList,person);
        System.out.println(arrayList);

    }
}
