import java.io.File;
import java.util.Arrays;

/**
 * current user 张++
 * 2020/8/3 0003
 * 18:45
 * 2020
 */


public class DFASDA {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (2*i+4*(10-i)==32){
                System.out.println(i+"---"+(10-i));
                break;
            }
        }
        int a1=0;
        while (a1<=10){
            if (2*a1+4*(10-a1)==32){
                System.out.println(a1+" ---"+(10-a1));
                break;
            }
            a1++;
        }

        int[] a={10,20,30,40,50};
        int[] b={10,20,60};
        int[] c=new int[a.length+b.length];
        int n=0;
        int m;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i]==b[j]){
                    c[n++]=a[i];
                }
            }
        }
        m=n;
        for (int i = 0; i < a.length; i++) {
            boolean flag=true;
            for (int j = 0; j < n; j++) {
                if (a[i]==c[j]){
                    flag=false;
                }
            }
            if (flag){
                c[n++]=a[i];
            }
        }
//        System.out.println(Arrays.toString(c));
//        System.out.println(n);
        for (int i = 0; i < b.length; i++) {
            boolean flag=true;
            for (int j = 0; j < n; j++) {
                if (b[i]==c[j]){
                    flag=false;
                }
            }
            if (flag){
                c[n++]=b[i];
            }
        }
        int[] d=new int[n-m];
//        System.out.println(d.length);
//        System.out.println(m);
//        System.out.println(Arrays.toString(c));
        for (int i = 0; i < d.length; i++) {
            d[i]=c[m++];
        }
        System.out.println(Arrays.toString(d));
    }
}
