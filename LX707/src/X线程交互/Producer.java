package X线程交互;

/**
 * Administrator
 * current user 张++
 * 2020/7/7 0007
 * current system date
 * 16:53
 * current system time
 * 2020
 * current year
 */


public class Producer implements Runnable {

    private StoreHouse house;
    private String who;

    //重写构造
    public Producer(StoreHouse house, String who) {
        this.house=house;
        this.who=who;
    }

    @Override
    public void run() {
        synchronized (house) {
            while (true) {
                //当b为true时生产
                if (house.b) {
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(who + "正在生产第" + i + "个产品");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(who + "已经生产完毕");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    house.b = false;
                    house.notify();
                }else {
                    try {
                        house.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //等待消费者消费
            }
        }
    }
}
