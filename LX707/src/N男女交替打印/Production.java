package N男女交替打印;

/**
 * current user 张++
 * 2020/7/13 0013
 * 11:05
 * 2020
 *
 */


public class Production implements Runnable {
    private Person person;
    private int i=0;

    public Production(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (person) {
                if (person.b) {
                    //生产
                    if (i % 2 == 0) {
                        person.setName("小明");
                        person.setNn("男");
                        person.setAge(19);

                    }else {
                    person.setName("小红");
                    person.setNn("女");
                    person.setAge(18);
                    }
                    //等待消费者消费完
//                    System.out.println("生产者生产完毕");
                    //修改b
                    person.b = false;
                    person.notify();
                    i++;
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    person.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
