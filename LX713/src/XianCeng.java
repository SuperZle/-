import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * current user 张++
 * 2020/7/13 0013
 * 19:47
 * 2020
 * 某电影院目前正在上映贺岁大片，共有100张票，而它有3个售票窗口售票，请设计一个程序模拟该电影院售票
 */


public class XianCeng {
    public static void main(String[] args) {
        //线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        executorService.
//        Future<?> submit = executorService.submit(new XianCengTest());
        XianCengTest xianCengTest=new XianCengTest();
        Thread t1=new Thread(xianCengTest,"窗口1");
        Thread t2=new Thread(xianCengTest,"窗口2");
        Thread t3=new Thread(xianCengTest,"窗口3");
        t1.start();
        t2.start();
        t3.start();



    }
}
