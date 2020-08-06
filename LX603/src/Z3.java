import java.util.Scanner;
public class Z3 {
    public static void main(String[] args) {
//        int a=5;
//        int b=88;
//        int c=9;
        Scanner sc=new Scanner(System.in);
        System.out.println("第一个数");
        //从控制台接受一个整型数字并赋值给变量a
        int a=sc.nextInt();
        System.out.println("第二个数");
        //从控制台接受一个整型数字并赋值给变量b
        int b=sc.nextInt();
        //从控制台接受一个整型数字并赋值给变量c
        System.out.println("第三个数");
        int c=sc.nextInt();
//        int d=(a>b? a:b);
//        int e=(d>c? d:c);
//        System.out.println(e);
        int max = Math.max(a, b);
        int max1 = Math.max(c, max);
        System.out.println(max1);


    }
}
