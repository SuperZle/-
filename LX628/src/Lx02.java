import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class Lx02 {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList();
        coll.add("安康华府");
        coll.add("发烧的体温");
        coll.add("对方是个护士");
        forEach(coll);

        Collection<Double> coll1=new ArrayList();
        coll1.add(1.2);
        coll1.add(2.2);
        coll1.add(3.2);

        forEach1(coll1);
        //forEach1(coll);
        List<String> list=new ArrayList();
        list.add("而然让我去额");
    }
    public static void forEach(Collection<?> coll){//?==? extends Object
        Iterator it=coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static void forEach1(Collection<? extends Number> coll){
        Iterator it=coll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
