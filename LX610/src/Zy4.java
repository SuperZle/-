import java.util.Arrays;

public class Zy4 {
    /**
     * String s = “6,1,9,23,36”;按“，”进行分割，从大到小排序输出
     */
    public static void main(String[] args) {
        String s="6,1,9,23,36";
        //s.getChars();
        String[] split = s.split("[\\D]");
        for (int i = 0; i < split.length; i++) {
            int i1 = Integer.parseInt(split[i]);
            int[] j={i1};
            Arrays.sort(j);
            System.out.println(j);
        }


//        for (int i = 0; i < split.length; i++) {
//            for (int j = i+1; j < split.length; j++) {
//                if ( split[i].compareTo(split[j])<0){
//                    String temp=split[i];
//                    split[i]=split[j];
//                    split[j]=temp;
//                }
//            }
//        }
        for (int j = 0; j < split.length; j++) {
            System.out.println(split[j]);
            }
    }
}
