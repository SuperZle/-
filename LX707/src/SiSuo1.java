/**
 * Administrator
 * current user 张++
 * 2020/7/7 0007
 * current system date
 * 15:49
 * current system time
 * 2020
 * current year
 * 死锁  需要多个线程   小明获取了B锁  需要A锁   小华获取了A锁 需要B锁
 *
 */


public class SiSuo1 implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while (true) {
            if (i % 3 == 0) {
                synchronized (DanLilan.fun()) {
                    System.out.println(Thread.currentThread().getName() + "获取了" + "A锁 需要B锁");
                    synchronized (DanLiE.fun()) {
                        System.out.println(Thread.currentThread().getName() + "获取了" + "B锁...........");

                    }
                }
            } else if (i%3==1){
                synchronized (DanLiE.fun()) {
                    System.out.println(Thread.currentThread().getName() + "获取了" + "B锁 需要A锁");
                    synchronized (DanLilan.fun()) {
                        System.out.println(Thread.currentThread().getName() + "获取了" + "A锁。。。。。。。。。");
                    }
                }
            }else {
                synchronized (DanLiE.fun()) {
                    System.out.println(Thread.currentThread().getName() + "获取了" + "B锁 需要A锁");
                    synchronized (DanLilan.fun()) {
                        System.out.println(Thread.currentThread().getName() + "获取了" + "A锁。。。。。。。。。");
                    }
                }
            }
            i++;
        }
    }
}
