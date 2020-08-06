import java.util.ArrayList;
import java.util.List;

/**
 * current user 张++
 * 2020/7/23 0023
 * 18:41
 * 2020
 */
public class aa {
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        int[] b={10,20,60};
        List<Integer> list1=new ArrayList();

        List<Integer> list2=new ArrayList();

        List<Integer> list3=new ArrayList();

        for (int i:a
             ) {
            list1.add(i);
            list2.add(i);
        }

        for (int i:b
        ) {
            list3.add(i);
        }

        list1.removeAll(list3);
        list3.removeAll(list2);
        for (Integer m:list1
             ) {
            list3.add(m);
        }
        System.out.println(list3);
//        List list=new ArrayList();
//        for (int i = 0; i < a.length; i++) {
//            boolean b1=true;
//            for (int j = 0; j < b.length; j++) {
//                if (a[i]==b[j]){
//                    b1=false;
//                }
//            }
//            if (b1){
//                list.add(a[i]);
//            }
//        }
//        for (int i = 0; i < b.length; i++) {
//            boolean b1=true;
//            for (int j = 0; j < a.length; j++) {
//                if (b[i]==a[j]){
//                    b1=false;
//                }
//            }
//            if (b1){
//                list.add(b[i]);
//            }
//        }
//        System.out.println(list);
    }
}
