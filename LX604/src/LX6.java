import java.util.Scanner;
public class LX6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入所需的行数");
        int r=sc.nextInt();
        System.out.println("请输入所需的列数");
        int cul=sc.nextInt();
        //外层控制行数
        for (int i=0;i<r;i++){
            //内层控制列数
            for (int a=0;a<cul;a++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
