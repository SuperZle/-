import java.util.Scanner;

public class Z2 {
    /**
     * 请你书写一个计算机类Cale，完成加减乘除方法的定义并调用测试 int
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入a");
        int a=sc.nextInt();
        System.out.println("输入b");
        int b=sc.nextInt();
        //选择加减乘除，我感觉有点鸡肋，但是没有更好的办法
        System.out.println("输入1~4");
        //int c=sc.nextInt();
        String c=sc.next();
        if (c=="+"){
            int a1=text1(a,b);
            System.out.println("a+b为:"+a1);
        }
        if (c=="-"){
            int a2=text2(a,b);
            System.out.println("a-b为:"+a2);
        }
        if (c=="*"){
            int a3=text3(a,b);
            System.out.println("a*b为:"+a3);
        }
        if (c=="/"){
            int a4=text4(a,b);
            System.out.println("a/b为:"+a4);
        }
    }
    //计算和的方法
    public static int text1(int a,int b){
        int a1=a+b;
        return a1;
    }
    //计算减的方法
    public static int text2(int a,int b) {
        int a2=a-b;
        return a2;
    }
    //计算除的方法
    public static int text3(int a,int b) {
        int a3=a*b;
        return a3;
    }
    //计算乘的方法
    public static int text4(int a,int b) {
        int a4=a/b;
        return a4;
    }

}
