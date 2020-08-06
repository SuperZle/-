import java.util.Scanner;

public class Z1 {
    /**
     * 实现对两个整数变量的值进行互换。要求两个整数用控制台录入
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入第一个数");
        int i=sc.nextInt();
        System.out.println("输入第二个数");
        int j=sc.nextInt();
        int t=0;
         t=i;
         i=j;
         j=t;
        System.out.println(i+""+j);

    }
}
