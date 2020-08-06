/**
 * Administrator
 * current user 张++
 * 2020/7/6 0006
 * current system date
 * 15:56
 * current system time
 * 2020
 * current year
 */


public class XinJianXinC implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String name = getClass().getName();
            System.out.println(name);

            System.out.println("我是新的创建方式"+Thread.currentThread().getName()+" "+i);
        }
    }
}
