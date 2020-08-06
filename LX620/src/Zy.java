import java.util.Arrays;
import java.util.Scanner;

public class Zy {
    /**
     *   键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值，
     * 打印输出结果如下：数组是：[43, 54, 545, 2312] 最大值是:2312
     */

    public static void main(String[] args) {
        int[] a=new int[10];
        fun(a);
    }

    public static void fun(int[] a){
        int s1=0;
        for (int i = 0; i < a.length; i++) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入第"+(i+1)+"个数");
            int j=scanner.nextInt();
            a[i]=j;
            if (j==0){
                s1=i;
                break;
            }
        }

        int[] ints = Arrays.copyOfRange(a, 0, s1);

        Arrays.sort(ints);

        String s = Arrays.toString(ints);

        System.out.println("数组为:"+s+"");

        System.out.println("最大的数为:"+ints[ints.length-1]);

    }
}
