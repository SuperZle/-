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


public class DanLilan {
    private static DanLilan danLilan=null;
    private static final Object object=new Object();
    private DanLilan(){}
    public static DanLilan fun(){
        synchronized (object){
            if (danLilan==null){
                danLilan = new DanLilan();
            }
            return danLilan;
        }
    }
}
