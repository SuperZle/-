import java.util.Arrays;

public class Sort {
    public static void sort(int[] a){
        int[] ints = Arrays.copyOf(a, a.length);
        Arrays.sort(a);
        int min=0;
        int max=0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == a[0]){
                min=i;
            }
            if (ints[i] == a[a.length-1]){
                max=i;
            }
        }
        int t=ints[min];
        ints[min]=ints[max];
        ints[max]=t;
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]+" ");
        }
    }
}
