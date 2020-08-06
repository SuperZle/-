import java.util.*;

/**
 * current user 张++
 * 2020/7/13 0013
 * 19:09
 * 2020
 */


public class PuKe {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        int i1=0;
        map.put(i1,"大王");
        list.add(i1);
        i1++;
        map.put(i1,"小王");
        list.add(i1);
        i1++;
        String[] s={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] s1={"♣","♠","♥","◆"};
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s1.length; j++) {
                map.put(i1,s[i]+s1[j]);
                list.add(i1);
                i1++;
            }
        }
        Collections.shuffle(list);

        List l1=new ArrayList();
        List l2=new ArrayList();
        List l3=new ArrayList();
        List l4=new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (i<=50){
                if (i%3==0){
                    l1.add(map.get(list.get(i)));
                }
                if (i%3==1){
                    l2.add(map.get(list.get(i)));
                }
                if (i%3==2){
                    l3.add(map.get(list.get(i)));
                }
            }else {
            l4.add(map.get(list.get(i)));
            }
        }

        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);
        Collections.sort(l4);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);



    }
}
