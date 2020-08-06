import java.util.Scanner;
public class LX8 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入所需的行数");
//        int r=sc.nextInt();
//        System.out.println("请输入所需的列数");
//        int b=sc.nextInt();
        for (int i=0; i<3; i++) {
            for (int j=3; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}