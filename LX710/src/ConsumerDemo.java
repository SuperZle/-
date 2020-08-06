import java.util.function.Consumer;

/**
 * Administrator
 * current user 张++
 * 2020/7/10 0010
 * current system date
 * 16:04
 * current system time
 * 2020
 * current year
 */


public class ConsumerDemo {
    public static void main(String[] args) {
        String[] a={"小明,男,100 ",  " 小红,女,80  ",  "韩梅,女,80  " ,  "吉姆,男,60"};

        fun(a,s ->{
            String[] split = s.split(",");
            System.out.println("姓名"+split[0]+"性别"+split[1]+"年龄"+split[2]);
        });

    }
    public static void fun(String[] strings, Consumer<String> consumer){
        for (String s:strings
             ) {
            consumer.accept(s);
        }

    }
}
