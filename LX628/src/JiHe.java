import java.util.*;

public class JiHe {
    public static void main(String[] args) {

        List list=new ArrayList();
        list.add(21);
        list.add(2567);
        list.add(156);

        System.out.println(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"  ");
        }
        System.out.println("------------+6+6+6+6+6+6+6+6+6+6+6+6+6+6+6+6+6");

        for (Object o:list
             ) {
            System.out.println(o);
        }
        System.out.println("------------");

        Set set=new HashSet();
        set.add(51);
        set.add(45877);
        set.add(4568);
        System.out.println(set);

        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()){
            System.out.print(iterator1.next()+"  ");
        }
        System.out.println("------------+6+6+6+6+6+6+6+6+6+6+6+6+6+6+6+6+6");

        for (Object o:set
             ) {
            System.out.println(o);
        }

        System.out.println("------------");
        Map map=new HashMap();
        map.put(1,"ASFG");
        map.put(2,"ADSFGHG");
        map.put(3,"ASFCVGHG");
        System.out.println(map);
        Set set1 = map.keySet();
        Iterator iterator2 = set1.iterator();
        while (iterator2.hasNext()){
            Object nextkey = iterator2.next();
            Object ovaule = map.get(nextkey);
            System.out.print(nextkey+"  ");

            System.out.println("------------");

            System.out.print(ovaule+"  ");
        }
        System.out.println("------------+6+6+6+6+6+6+6+6+6+6+6+6+6+6+6+6+6");

        for (Object o:set1
             ) {
            System.out.println(o);
            System.out.println(map.get(o));
        }

    }
}
