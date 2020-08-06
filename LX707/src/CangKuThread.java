/**
 * Administrator
 * current user 张++
 * 2020/7/7 0007
 * current system date
 * 11:20
 * current system time
 * 2020
 * current year
 */


public class CangKuThread implements Runnable{

    private transient int i=100;
    private Object object=new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (DanLilan.fun()) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i > 0) {
                    i--;
                    System.out.println(Thread.currentThread().getName() + "成功够买一张票" + "还剩" + i + "张票");
                }
            }
        }
    }
}
