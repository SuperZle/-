package N男女混合生产;

/**
 * Administrator
 * current user 张++
 * 2020/7/7 0007
 * current system date
 * 18:05
 * current system time
 * 2020
 * current year
 */


public class Consumer implements Runnable{

    private StoreHouse house;
    private String who;
    public Consumer(StoreHouse house, String who) {
        this.house = house;
        this.who = who;
    }

    @Override
    public void run() {
        synchronized (house){
            while (true){
                if (!house.b){
                    //消费者消费
                    System.out.println(who);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(who+"消费完毕");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    house.b=true;
                    house.notify();
                }else {
                    try {
                        house.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
