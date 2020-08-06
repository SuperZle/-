/**
 * Administrator
 * current user 张++
 * 2020/7/6 0006
 * current system date
 * 11:30
 * current system time
 * 2020
 * current year
 */


public class NewXian2 extends Thread{
    NewXian2(String name){
        super(name);
        //setName(name);
    }

    @Override
    public void run() {

        try {
            NewXian2.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
