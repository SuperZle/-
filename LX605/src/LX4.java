import java.util.Scanner;

public class LX4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入所需行数");
        int a=sc.nextInt();
        for (int i=1;i<a;i++){
            for (int j=a;j>i;j--){
                System.out.print(i+"*"+j+"="+i*j+"  ");
            }System.out.println();
        }
    }
}
