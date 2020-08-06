package Lx男女交替打印;

/**
 * current user 张++
 * 2020/7/13 0013
 * 14:24
 * 2020
 */


public class Consumer implements Runnable{

    private Person person;

    public Consumer(Person person) {
        this.person = person;
    }

    public Consumer() {
    }

    @Override
    public void run() {
        while (true){
            synchronized (person){
                if (!person.b){
                    System.out.println(person.getName()+person.getSex());
                    //提醒  修改
                    person.b=true;
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
