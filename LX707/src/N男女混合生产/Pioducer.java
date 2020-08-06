package N男女混合生产;

import java.util.HashMap;

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


public class Pioducer implements Runnable{

    private StoreHouse house;
    private String who;
    private int i=0;

    public Pioducer(StoreHouse house, String who) {
        this.house = house;
        this.who = who;
    }

    @Override
    public void run() {
        synchronized (house){
            while (true) {
                if (house.b) {
                    if (i%2==0){
                    //表示正在生产
                    System.out.println(who + "正在生产");
                        Person person = new Person("小明", "男", 18);

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(who+person.getName()+person.getSex()+person.getAge());
                        house.b = false;
                        house.notify();
                        i++;
                    }else {
                        System.out.println(who + "正在生产");
                        Person person = new Person("小红", "女", 19);

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(who+person.getName()+person.getSex()+person.getAge());
                        house.b = false;
                        house.notify();
                        i++;
                    }
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
