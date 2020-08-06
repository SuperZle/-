package Fs文件中读取;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * current user 张++
 * 2020/7/13 0013
 * 12:35
 * 2020
 */


public class MainTread {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, IOException {
        Properties properties=new Properties();
        properties.setProperty("className1","person");
        properties.setProperty("classFunName1","work");
        properties.setProperty("className2","cat");
        properties.setProperty("classFunName2","sleep");
        OutputStream outputStream=new FileOutputStream("E:\\JAVA\\LX713\\src\\Fs文件中读取\\bd.properties");
        properties.store(outputStream,"ZLE");
        Class personClass = Person.class;
        Person person =(Person) personClass.newInstance();
//        Method declaredMethod = personClass.getDeclaredMethod("work");
        Method declaredMethod = personClass.getDeclaredMethod(properties.getProperty("classFunName1"));
        declaredMethod.invoke(person);

//        declaredMethod.invoke(person);




    }
}
