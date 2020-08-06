package N男女混合生产;

/**
 * Administrator
 * current user 张++
 * 2020/7/7 0007
 * current system date
 * 18:06
 * current system time
 * 2020
 * current year
 */


public class MainThread {
    public static void main(String[] args) {
        //仓库
        StoreHouse house=new StoreHouse();
        //生产者
        Pioducer pioducer=new Pioducer(house,"生产者");
        //消费者
        Consumer consumer=new Consumer(house,"消费者");

        Thread t1=new Thread(pioducer,"生产者");

        Thread t2=new Thread(consumer,"消费者");

        t1.start();

        t2.start();

    }
}
