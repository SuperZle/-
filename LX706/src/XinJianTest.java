/**
 * Administrator
 * current user 张++
 * 2020/7/6 0006
 * current system date
 * 16:02
 * current system time
 * 2020
 * current year
 */


public class XinJianTest {
    public static void main(String[] args) {
        //新建Runnable，的实现类
        Runnable xinJianXinC=new XinJianXinC();
        //Thread​(Runnable target, String name)
        Thread thread=new Thread(xinJianXinC,"阿基米德");
        thread.start();
    }
}
