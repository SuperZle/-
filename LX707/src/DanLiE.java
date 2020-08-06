/**
 * Administrator
 * current user 张++
 * 2020/7/7 0007
 * current system date
 * 14:05
 * current system time
 * 2020
 * current year
 * 饿汉 模式 自己首先创建好对象
 */


public class DanLiE {
    //先创建一个对象  不可改变的
    private static final DanLiE danLiE=new DanLiE();

    //私有的构造
    private DanLiE(){}

    public static DanLiE fun(){
        return danLiE;
    }
}
