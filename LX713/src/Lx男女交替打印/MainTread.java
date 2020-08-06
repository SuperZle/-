package Lx男女交替打印;

/**
 * current user 张++
 * 2020/7/13 0013
 * 14:24
 * 2020
 */


public class MainTread {
    public static void main(String[] args) {
        Person person=new Person();
        Consumer consumer=new Consumer(person);
        Pro pro=new Pro(person);
        Thread t1=new Thread(consumer,"消费者");
        Thread t2=new Thread(pro,"生产者");
        t1.start();
        t2.start();

    }
}
