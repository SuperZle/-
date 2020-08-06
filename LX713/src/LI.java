import java.util.*;
import java.util.stream.Stream;

/**
 * current user 张++
 * 2020/7/13 0013
 * 13:55
 * 2020
 */


public class LI {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Map<String,String> map=new HashMap();
        map.put("A","1");
        map.put("B","2");
        map.put("C","3");
        map.put("D","4");
        map.put("E","5");
        Stream<String> stream = map.keySet().stream();
        stream.forEach(a -> System.out.println(a));
        Stream<String> stream1 = map.values().stream();
        stream1.forEach(a -> System.out.println(a));
        System.out.println(stream);
        System.out.println(stream1);
        Stream<Map.Entry<String, String>> stream2 = map.entrySet().stream();
        System.out.println(stream2);
        System.out.println(map);
        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            //key
            System.out.println(next);
            //value
            System.out.println(map.get(next));
        }

        System.out.println("=================================================");
        List<String> list=new ArrayList();
        list.add("张飞");
        list.add("张翼德");
        list.add("张55");
        list.add("张11");
        list.add("张2");
        list.add("张飞66");
        list.stream().filter(a ->a.startsWith("张")).filter(a ->a.length()==2).forEach(a -> System.out.println(a));
        Set<Integer> set=new HashSet<>();
        set.add(11);
        set.add(111);
        set.add(1111);
        set.add(11111);
        set.add(111111);
        set.add(1111111);

        Stream<Integer> stream3 = set.stream();

        stream3.forEach(a -> System.out.println(a));
        System.out.println("=================================================");

//        System.out.println(stream3);
        Iterator<Integer> iterator1 = set.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());

        }
        System.out.println("=================================================");

        for (Integer i:set
             ) {
            System.out.println(i);
        }
    }
}
