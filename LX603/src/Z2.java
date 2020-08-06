import java.util.Scanner;
public class Z2 {
    public static void main(String[] args) {
//        int a=22;
//        int b=9;
        Scanner sc=new Scanner(System.in);
        System.out.println("第一个数");
        //从控制台接受一个整型数字并赋值给变量a
        int a=sc.nextInt();
        System.out.println("第二个数");
        //从控制台接受一个整型数字并赋值给变量b
        int b=sc.nextInt();
        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
