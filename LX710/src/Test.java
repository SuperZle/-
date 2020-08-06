/**
 * Administrator
 * current user 张++
 * 2020/7/10 0010
 * current system date
 * 15:04
 * current system time
 * 2020
 * current year
 */


public class Test {
    public static void main(String[] args) {

        double r=6;
       double d=fun(r, new LI() {
           @Override
           public double fun(double r) {
               return Math.PI*r*r;
           }
       });

       double d1=fun(r,(double b)->Math.PI*b*b);


        System.out.println(d1);
    }
    public  static double fun(double r,LI li){
            return Math.PI*r*r;
    }

}
