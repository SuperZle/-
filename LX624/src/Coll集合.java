import java.util.ArrayList;
import java.util.Collection;

public class Coll集合 {
    public static void main(String[] args) {
        //定义一个集合
        Collection< Object > col=new ArrayList();
        col.add("来吧");
        col.add("AAAA");
        System.out.println(col);
        //清空集合
        col.clear();
        System.out.println(col);
        col.add("来吧");
        col.add("AAAA");
            //Person person = new Person("小米",12);
        //Person person1 = new Person("小米",12);
        col.add(new Person("小米",12));
        //集合中是否包含
        boolean aaa = col.contains("AAA");
        //boolean contains = col.contains(person1);

        System.out.println(aaa);
        System.out.println(col.contains(new Person("小米",12)));

    }
}
