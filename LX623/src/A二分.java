import java.util.Arrays;

public class A二分 {
    public static void main(String[] args) {
        int[] i={1,5,15,1,5,541,145,52};

        System.out.println(fun(i));
    }
    public static double fun(int[] a){
        Arrays.sort(a);
        double d=(a[0]+a[a.length-1])/2.0;
        if (d>=a[a.length/2-1] && d<=a[a.length/2+1]){
            return d;
        }
        if (d<a[a.length/2-1]){
            //向上找
            String s = a.toString();
            String substring = s.substring(a.length / 2);
            String[] split = substring.split("");
            int[] a1=new int[split.length+1];
            a1[0]=(int)d;
            for (int i = 0; i < split.length; i++) {
                a1[i+1]=Integer.parseInt(split[i]);
            }
            fun(a1);
        }
        if (d>a[a.length/2+1]){
            //向下找
            String s= a.toString();
            String substring = s.substring(0, a.length / 2 + 1);
            String[] split = substring.split("");
            int[] a1=new int[split.length+1];
            a1[split.length]=(int)d;
            for (int i = 0; i < split.length; i++) {
                a1[i]=Integer.parseInt(split[i]);
            }
            fun(a1);
        }
        return d;
    }
}
