import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class CaiXiang {
    /**
     * 验证“鬼谷猜想”：对任意自然数，若是奇数，就对它乘以 3 再加 1；若是偶数，就对它除以 2，
     * 这样得到一个新数，再按上述计算规则进行计算，一直进行下去，最终必然得到 1
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        int i=scanner.nextInt();
        fun(i);
    }
    public static void fun(int i){
        if (i==1){
            System.out.println(i);
            return;
        }
        if (i%2==0){
            int j=i/2;
            fun(j);
        }else{
            int j=i*3+1;
            fun(j);
        }

    }
}
