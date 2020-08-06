package DanLi;



/**
 * current user 张++
 * 2020/7/13 0013
 * 15:24
 * 2020
 */

public class LanHan {
    private LanHan(){}
    private static LanHan l=null;
    public static synchronized LanHan fun(){
        if (l==null){
            l=new LanHan();
        }
        return l;
    }
}
