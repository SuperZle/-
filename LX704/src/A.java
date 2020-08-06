import java.util.*;

/**
 *  有一个ArrayList集合如下，删除其中字符串为“b”的元素（两个“b”都需要删除） 
 * ArrayList<String>list = new ArrayList<>();
 * list .add("a");
 * list .add("a");
 * list .add("b");
 * list .add("b");
 * list .add("c");
 * list .add("c");

 */
public class A {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");list.add("b");
        list.add("b");list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
//        List<String>list1=new ArrayList();
//        list1.addAll(0,list);

        //boolean b = list1.removeAll(Collections.singleton("b"));
//        System.out.println(list);

//        for (String s:list
//             ) {
//            if (s.equals("b")){
//                continue;
//            }
//            list1.add(s);
//        }
//        for (String s:list) {
//            if (s.equals("b")) {
//                list.remove(s);
//            }
//        }
//        for (int i = list.size()-1; i >=0; i--) {
//            String s=list.get(i);
//            if (s.equals("b")){
//                list.remove(s);
//            }
//        }
        //singleton​(T o)
        //返回仅包含指定对象的不可变集。
        list.removeAll(Collections.singleton("b"));
        System.out.println(list);
    }
}
