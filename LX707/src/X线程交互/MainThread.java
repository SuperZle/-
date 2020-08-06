package X线程交互;

/**
 * Administrator
 * current user 张++
 * 2020/7/7 0007
 * current system date
 * 16:51
 * current system time
 * 2020
 * current year
 * 生产时消费需要wait  需要生产的唤醒  每生产一次休眠1秒
 * 消费时生产需要wait  需要消费的唤醒
 */


public class MainThread {
    public static void main(String[] args) {
        //商品仓库
        StoreHouse house=new StoreHouse();
        //生产者
        Producer producer=new Producer(house,"生产者");
        //消费者
        Consumer consumer=new Consumer(house,"消费者");
        //创建生产者的线程
        Thread t1=new Thread(producer ,"生产者");
        //创建消费者的线程
        Thread t2=new Thread(consumer ,"消费者");
        //开启生产
        t1.start();
        //开启消费
        t2.start();

    }
}
