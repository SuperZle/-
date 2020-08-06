import java.util.function.Function;

/**
 * Administrator
 * current user 张++
 * 2020/7/10 0010
 * current system date
 * 17:24
 * current system time
 * 2020
 * current year
 */


public class ZyFun {
    public static void main(String[] args) {
        String s="小米,30";
        Integer fun = fun(s, f1 -> f1.split(","), f1 -> Integer.valueOf(f1[1]), f1 -> f1 + 100);
        System.out.println(fun);
    }
    public static Integer fun(String s, Function<String,String[]> f1,Function<String[],Integer> f2,Function<Integer,Integer> f3){
        return f1.andThen(f2).andThen(f3).apply(s);
    }
}
