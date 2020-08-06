//输入Scanner会自动出现
import java.util.Scanner;
public class Z4 {
    public static void main(String[] args) {
//        int a=55555;
//        int b=885555;
//        int c=99955855;
        //导包 import java.util.Scanner;
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
        if (a>b){
            //进来就是a大
            if (a>c){
                System.out.println("较大的数为:"+a);
            }else {
                System.out.println("较大的数为:"+c);
            }
        }else{
            if (b>c){
                System.out.println("较大的数为:"+b);
            }else{
                System.out.println("较大的数为:"+c);
            }
        }
    }
}
