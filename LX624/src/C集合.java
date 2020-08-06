import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class C集合 {
    public static void main(String[] args) {
        Collection<Object> coll= new ArrayList();
        coll.add("回文数");
        coll.add("素数");
        Collection<Object> coll1= new ArrayList();
        coll1.add("回文数1");
        coll1.add("素数1");
        boolean b = coll.addAll(coll1);
        System.out.println(coll);
        System.out.println(b);
        System.out.println(coll1);
        int size = coll.size();
        System.out.println(size);

    }
}
