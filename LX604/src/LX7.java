import java.util.Scanner;
public class LX7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入所需的行数");
        int r=sc.nextInt();
//        System.out.println("请输入所需的列数");
//        int b=sc.nextInt();
        for (int i=0;i<r;i++){
            for (int j=0; j<=i ;j++) {
                System.out.print("*");
            }System.out.println();
        }
        //外层控制行数
//        for (int i=0;i<r;i++){
//            //内层控制列数
//            for (int a=0;a<b;a++){
//                System.out.println("*");
//
//            }System.out.println();
//        }
    }
}
