import java.util.Arrays;

public class a {
    public static void main(String[] args) {
        String s5=  "6,9,1,23,36";
        String[] split = s5.split(",");
        int[] j=new int[split.length];
        for (int i = 0; i < split.length; i++) {
            j[i]=Integer.parseInt(split[i]);
        }
        System.out.println(Arrays.toString(j));
        //int[] ints = Arrays.asList(split).stream().mapToInt(Integer::parseInt).toArray();
        //j=ints;
        Arrays.sort(j);
        for (int i = j.length-1; i >= 0; i--) {
            System.out.println(j[i]);
        }
        /*for (int j = 0; j < ints.length; j++) {
            for (int k = j+1; k < ints.length; k++) {
                if (ints[j]<ints[k]){
                    int temp=ints[j];
                    ints[j]=ints[k];
                    ints[k]=temp;
                }
            }System.out.println(ints[j]);
        }*/
    }
}
