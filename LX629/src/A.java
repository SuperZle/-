import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(18);
        list.add(145);
        list.add(132);
        list.add(1457);

        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

    }
}
