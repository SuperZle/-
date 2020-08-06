package N男女交替打印;

/**
 * current user 张++
 * 2020/7/13 0013
 * 11:04
 * 2020
 */


public class MainTread {
    public static void main(String[] args) {
        //创建两个人
        Person person=new Person();

        //创建生产者
        Production production=new Production(person);
        //创建线程
        Thread t1=new Thread(production,"生产者");
        //创建消费者
        Consumer consumer=new Consumer(person);
        //创建线程
        Thread t2=new Thread(consumer,"消费者");
        //打开线程
        t1.start();
        t2.start();


    }
}
