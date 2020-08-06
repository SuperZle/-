import java.util.HashSet;
import java.util.Set;

/**
 * Administrator
 * current user 张++
 * 2020/7/11 0011
 * current system date
 * 12:40
 * current system time
 * 2020
 * current year
 */


public class sad {
    public static void main(String args[]) {
        Set<Double> s = new HashSet<Double>();
        short A=0;
        for (double i = 0.0; i < 10.0; i++) {
            s.add(i);
//            s.remove(A);
//            System.out.println(s);

        }

//        System.out.println(s.size());
        System.out.println(s);
        s.remove(1);
        System.out.println(s);
        Double d=3.0;
        Double d1=2.0;
        int i1 = d1.hashCode();
        int i = d.hashCode();
        Double d2=4.0;
        System.out.println(d2.hashCode());

        System.out.println(i);
        System.out.println(i1);

    }
}
