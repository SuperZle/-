/**
 * Administrator
 * current user 张++
 * 2020/7/7 0007
 * current system date
 * 14:16
 * current system time
 * 2020
 * current year
 * 懒汉  synchronized来控制
 */


public class DanLilan1 {
    private static DanLilan1 danLilan=null;
    private DanLilan1(){}
    public static synchronized DanLilan1 fun(){
        if (danLilan==null){
            danLilan = new DanLilan1();
        }
        return danLilan;

    }
}
