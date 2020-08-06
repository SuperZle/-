import java.util.Scanner;

public class Z3 {
    /**
     * 从控制台接受打印直角三角形的行数，制并通过方法的封装调用输出到控台
     * @param args
     */
    public static void main(String[] args) {
        dySjx();
    }
    public static void dySjx(){
        //导入包 import java.util.Scanner;
        Scanner sc=new Scanner(System.in);
        System.out.println("请设置所需行数");
        int i=sc.nextInt();
//        System.out.println("请设置所需列数");
//        int j=sc.nextInt();
        //控制行
//        for (int a=0;a<i;a++){
//            //控制列
//            for (int b=0;b<a;b++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for (int a=0;a<i;a++){
            //控制列
            for (int b=a;b>=0;b--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
