package Obtain;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Administrator
 * current user 张++
 * 2020/7/9 0009
 * current system date
 * 18:28
 * current system time
 * 2020
 * current year
 */


public class TestDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {


//
//        Class personClass = Person.class;
//        Object o = personClass.newInstance();
//
//        Method eat = personClass.getDeclaredMethod("eat");
//        eat.invoke(o);
//        String className="Obtain.Person";
//        String funName1="sleep";
//        String funName2="eat";
        Properties properties=new Properties();
        properties.setProperty("className1","Obtain.Person");
        properties.setProperty("funName1","sleep");
        properties.setProperty("funName2","eat");

        properties.setProperty("className2","Obtain.Cat");
        properties.setProperty("funName11","sleep");
        properties.setProperty("funName22","eat");

        FileOutputStream outputStream=new FileOutputStream("E:\\JAVA\\LX709\\src\\Obtain\\db.properties");
        properties.store(outputStream,"ZLE");
//        FileInputStream inputStream=new FileInputStream("E:\\JAVA\\LX709\\src\\Obtain\\db.properties");
//        properties.load(inputStream);
        //Class 文件
        Class className1 = Class.forName(properties.getProperty("className1"));

        Person person = (Person) className1.newInstance();

        className1.getDeclaredMethod(properties.getProperty("funName1")).invoke(person);
        className1.getDeclaredMethod(properties.getProperty("funName2")).invoke(person);
        Class className2 = Class.forName(properties.getProperty("className2"));
        Cat cat  =(Cat) className2.newInstance();
        className2.getDeclaredMethod(properties.getProperty("funName11")).invoke(cat);
        className2.getDeclaredMethod(properties.getProperty("funName22")).invoke(cat);



//        Class aClass = Class.forName(className);
//        Person person = (Person)aClass.newInstance();
//        Method sleep = aClass.getDeclaredMethod(funName1);
//        sleep.invoke(person);


    }
}
