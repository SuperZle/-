import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * current user 张++
 * 2020/7/16 0016
 * 20:07
 * 2020
 */


public class A平方和 {
    public static void main(String[] args) {
        int n=56;
        int b =0;
        while (n>0){
            b+=(n%10)*(n%10);
            n/=10;
        }
        System.out.println(b);
        int[] a={545,48,4,897,4};

        int[] a1={545,48,4,897,4};

        int[] a2=new int[a.length+a1.length];
        for (int i = 0 ; i < a.length; i++) {
            a2[i]=a[i];

        }
        for (int i = 0 ,j=a.length; i < a1.length; i++,j++) {
            a2[i]=a1[i];

        }
        System.out.println(Arrays.toString(a2));


    }
}
