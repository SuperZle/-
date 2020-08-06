import java.util.Scanner;

public class Zy5 {
    /**
     * 定义一个方法，接受来自键盘输入的整数，求出这两个整数的最小公倍数。最大公约数
     * public  static  int  fun(int i,int j) {
     *  }
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(min(m,n));
    }
    public static int min(int m,int n){
        return n*m/max(m,n);
    }
    public static int max(int m,int n){
        if (m%n == 0){
            return n;
        }
        if (n!= 0 && m != 0){
            return max(n,m%n);
        }return 1;
    }
}
