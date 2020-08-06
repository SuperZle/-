import com.sun.org.apache.regexp.internal.RE;

/**
 * current user 张++
 * 2020/7/13 0013
 * 10:08
 * 2020
 * 最大公约数最小公倍数
 */


public class GaoYueShu {
    public static void main(String[] args) {

        int m=9;
        int n=10;
        //最大公约数
        System.out.println(gongYueShu(m,n));
//        最小公倍数
        System.out.println(m*n/gongYueShu(m,n));

    }
    public static int gongYueShu(int m,int n){

//        int temp;
        //最大公约数
//        if (m>n){
//            temp=m;
//            n=temp;
//            m=n;
//        }
        if (m==0||n==0){
            return 0;
        }

        if (m%n==0){
            return n;
        }
        return gongYueShu(n,m%n);
    }
}
