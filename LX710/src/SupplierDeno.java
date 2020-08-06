import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;
import java.util.function.Supplier;

/**
 * Administrator
 * current user 张++
 * 2020/7/10 0010
 * current system date
 * 15:33
 * current system time
 * 2020
 * current year
 */


public class SupplierDeno {
    public static void main(String[] args) {
        String s=fun1(()->"你好");
        System.out.println(s);

        int[] ints={1,2,65,5,48,8,7,85};
        int i=fun2(new Supplier<Integer>() {
            @Override
            public Integer get() {
                Arrays.sort(ints);
                return ints[ints.length-1];
            }
        });

        System.out.println(i);

    }
    public static String fun1(Supplier<String> supplier){
        return supplier.get();
    }
    public static int fun2(Supplier<Integer> supplier){
        return supplier.get();

    }
}
