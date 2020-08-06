import sun.plugin.javascript.navig.Link;

import java.util.*;


public class ArrayList1 {
    public static void main(String[] args) {
        fun03();
        String s="3";
        System.out.println(s.hashCode());
    }
    public static void fun01(){

        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("大风大雨");
        int size = arrayList.size();
        System.out.println(size);
        arrayList.clear();

    }
    public static void fun02(){

        LinkedList<String> arrayList=new LinkedList<String>();

        arrayList.add("大风大雨");

        int size = arrayList.size();

        System.out.println(size);

        arrayList.clear();

    }
    public static void fun03(){
        Set<Double> set= new HashSet();
        set.add(1.2);
        set.add(15.2);
        set.add(16.2);
        set.add(18.2);
        set.add(188.2);

        System.out.print(set);

        for (Double d:set
             ) {
            System.out.print(d+" ");
        }
        System.out.println("--------------------------------------------------------------");
        Iterator<Double> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println((set.size()));

    }

}
