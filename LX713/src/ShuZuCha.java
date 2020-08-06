import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * current user 张++
 * 2020/7/22 0022
 * 15:28
 * 2020
 */


public class ShuZuCha {
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,4,5,6,1,2,1,2};
        System.out.println(Arrays.toString(fun(a)));

    }
    public static int[] fun(int[] a){
        int[] c=new int[a.length];
        int a1=0;
        for (int j = 0; j <= a.length; j++) {
            for (int i = j+1; i < a.length; i++) {
                if (a[i]==a[j]){
                    //得到重复的
                    c[a1]=a[i];
                    a1++;
                }
            }
        }//        for (int i = 0; i < c.length; i++) {

        int e=0;
        for (int i = 0; i < a.length; i++) {
            boolean f=true;
            for (int j = i+1; j < a.length; j++) {
                if (a[i]==a[j]){
                    f=false;
                    break;
                }
            }
            if (f){
                e++;
            }
        }

        int[] d=new int[e];
        int z=0;
        for (int i = 0; i < a.length; i++) {
            boolean f=true;
            for (int j = i+1; j < a.length; j++) {
                if (a[i]==a[j]){
                    f=false;
                    break;
                }
            }
            if (f){
                d[z]=a[i];
                z++;
            }
        }

        System.out.println(Arrays.toString(d)+e);





        return c;
    }


}

