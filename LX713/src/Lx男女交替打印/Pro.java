package Lx男女交替打印;

/**
 * current user 张++
 * 2020/7/13 0013
 * 14:22
 * 2020
 */


public class Pro implements Runnable{
    private Person person;
    private int i=0;

    public Pro() {
    }

    public Pro(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        while (true){
            synchronized (person){
                if (person.b){
                    if (i%2==0){
                        person.setName("小红");
                        person.setSex("女");
                        i++;
                    }else {
                        //生产
                        person.setName("小明");
                        person.setSex("男");
                        i++;
                    }
                    //提醒生产完毕
                    person.b = false;
                    person.notify();
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //等待
                try {
                    person.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        }
    }
}
