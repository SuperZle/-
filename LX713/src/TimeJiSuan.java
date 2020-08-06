import com.sun.org.apache.regexp.internal.RE;

import java.util.Date;

/**
 * current user 张++
 * 2020/7/30 0030
 * 10:09
 * 2020
 */


public class TimeJiSuan {
    public static void main(String[] args) {
        int a=45;
        testTime(fun1(a));
        testTime(fun2(a));
//        Date date=new Date();
//        long b1=System.currentTimeMillis();
//        int i = fun2(a);
//        long b2=System.currentTimeMillis();
//        double t1=(double) (b2-b1)/1000;
//        System.out.println(i+" ------------ "+t1+"秒");


//        System.out.println(date.getTime());
//        System.out.println(System.nanoTime());
    }

    public static void testTime(int s){
        long b1=System.currentTimeMillis();
        int s1=s;
        long b2=System.currentTimeMillis();
        double t1=(double) (b2-b1)/1000;
        System.out.println("用时"+t1+"s");
        System.out.println("------------------------------------");
    }
    public static int fun1(int n){
        if (n<=1){
            return n;
        }
        return fun1(n-2)*fun1(n-2)+fun1(n-3);
    }
    public static int fun2(int n){
        if (n<=1){
            return n;
        }
        int f=0;
        int c=1;
        for (int i = 0; i < n-1; i++) {
            int next=f+c;
            f=c;
            c=next;
        }
        return c;
    }
}
