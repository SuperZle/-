import java.util.concurrent.*;

/**
 * Administrator
 * current user 张++
 * 2020/7/6 0006
 * current system date
 * 16:47
 * current system time
 * 2020
 * current year
 */


public class XianC {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程池                                                            线程池数
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future submit = executorService.submit(new XTest(541564561,2));
        Object o = submit.get();
        System.out.println(o);
        executorService.shutdown();

    }
}
