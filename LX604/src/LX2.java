import java.util.Scanner;
public class LX2 {
    public static void main(String[] args) {
        //导包 import java.util.Scanner;
        Scanner sc=new Scanner(System.in);
        System.out.println("第一个数");
        //从控制台接受一个整型数字并赋值给变量a
        int a=sc.nextInt();
        System.out.println("第二个数");
        //从控制台接受一个整型数字并赋值给变量b
        int b=sc.nextInt();
        int c=a>b?a:b;
        System.out.println("最终较大的为："+c);
    }
}
