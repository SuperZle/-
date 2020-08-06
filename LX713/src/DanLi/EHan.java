package DanLi;

/**
 * current user 张++
 * 2020/7/13 0013
 * 15:25
 * 2020
 */


public class EHan {
    private EHan() {
    }
    private static final EHan e=new EHan();

    public static synchronized EHan fun(){
        return e;
    }
}
