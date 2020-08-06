/**
 * current user 张++
 * 2020/7/30 0030
 * 9:46
 * 2020
 */


public class F斐波那契 {
    public static void main(String[] args) {

                String s1 = "hello" ;
                String s2 = "world" ;
                String s3= s1.concat(s2);
                s1=s2;
//                change(s1,s2);
                System.out.println(s1+"---"+s2);
//                System.out.println(s1);

                StringBuffer sb1 = new StringBuffer("hello") ;
                StringBuffer sb2 = new StringBuffer("world") ;
                change(sb1,sb2);
                System.out.println(sb1+"---"+sb2);
            }
            public static StringBuffer change(StringBuffer sb1 ,StringBuffer sb2){


                sb2.append(sb1) ;
                return  sb1 = sb2;
            }
            public static void change(String s1,String s2){
                s1 = s2 ;
                s2 = s1.concat(s2) ;

//        System.out.println(fbnq(150));

    }
    public static int fbnq(int n){
        if (n<=1){
            return n;
        }
        int first=0;
        int second=1;
        //我们已经知道第0个数是0,第1个数是1  第n个数就循环n-1次就行
        for (int i = 0; i < n-1; i++) {
            int next=first+second;
            //后一个变成前一个
            first=second;
            //合为后一个
            second=next;
        }
        return second;
    }
}
