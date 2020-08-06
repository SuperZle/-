/**
 * current user 张++
 * 2020/7/13 0013
 * 10:32
 * 2020
 * 5！+4！+3！+2！+1!
 */


public class Lx1 {
    public static void main(String[] args) {
        System.out.println(fun(3));
        int sum=0;
        for (int i = 1; i <= 5 ; i++) {
            sum+=fun(i);//1+2+6+24+120
        }

        System.out.println(sum);

    }
    public static int fun(int i){

        if (i==1){
            return 1;
        }

        return i*fun(i-1);

    }
}
