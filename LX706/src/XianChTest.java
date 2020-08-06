import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Administrator
 * current user 张++
 * 2020/7/6 0006
 * current system date
 * 16:48
 * current system time
 * 2020
 * current year
 */


public class XianChTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
//        Thread t1=new Thread(new XinJianXinC());
//        executorService.submit(new Thread(new XinJianXinC()));
//        executorService.submit(new Thread(new XinJianXinC()));
//        executorService.submit(new Thread(new XinJianXinC()));
//        executorService.submit(new Thread(new XinJianXinC()));
        executorService.submit(new XinJianXinC());


    }
}
