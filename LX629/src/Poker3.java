import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class Poker3 {
    public static void main(String[] args) {
        fun();
    }
    public static void fun(){

    Map<Integer , String> map=new HashMap<>();

    List<Integer> list = new ArrayList();
    //创建扑克牌集合
        String[] s={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] s1={"♣","♠","♥","◆"};

        //添加大王小王
        int a=0;
        map.put(a,"大王");
        list.add(a);
        a++;
        map.put(a,"小王");
        list.add(a);
        a++;
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s.length; j++) {
                map.put(a,s1[i]+s[j]);
                list.add(a);
                a++;
            }
        }
        //创建四个集合
        List<String> p1=new ArrayList<>();
        List<String> p2=new ArrayList<>();
        List<String> p3=new ArrayList<>();
        List<String> p4=new ArrayList<>();

        Collections.shuffle(list);
        for (int i = 0; i < list.size(); i++) {
            if (i<51) {
                if (i%3==0){
                    p1.add(map.get(list.get(i)));
                }
                if (i%3==1){
                    p2.add(map.get(list.get(i)));
                }
                if (i%3==2){
                    p3.add(map.get(list.get(i)));
                }
            }else {
            p4.add(map.get(list.get(i)));
            }
        }

        Collections.sort(p1,String::compareTo);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(p4);

        System.err.println(p1);
        System.err.println(p2);
        System.err.println(p3);
        System.out.println(p4);

    }
}
