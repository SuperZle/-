package N男女交替打印;

/**
 * current user 张++
 * 2020/7/13 0013
 * 11:04
 * 2020
 */


public class Consumer implements Runnable {
    private Person person;

    public Consumer(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (person) {
                if (!person.b) {
                    System.out.println(person.getName()+"  " + person.getNn()+"  " + person.getAge());
                    //修改
                    person.b = true;
                    person.notify();
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
