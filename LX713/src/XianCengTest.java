import DanLi.EHan;
import DanLi.LanHan;

/**
 * current user 张++
 * 2020/7/13 0013
 * 19:49
 * 2020
 */


public class XianCengTest implements Runnable{

    private int i=100;
    private Object object=new Object();
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (EHan.fun()){
                if (i>0){
                    i--;
                    System.out.println(Thread.currentThread().getName()+"成功购买一张票,还剩 "+i+"张");
                }
            }
        }

    }
}
