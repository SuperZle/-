import java.util.Scanner;

public class LX3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int i=sc.nextInt();
        double random=Math.random();//[0,1)  1~10
        int d=(int)(random*10)+1;
        //控制输入次数
        for (int c=1;c<5;c++) {
            if (i == d) {
                System.out.println("中奖了");
            } else if (i > d) {
                System.out.println("大了,继续");
                continue;
            } else {
                System.out.println("小了，继续");
                continue;
            }
            int a=sc.nextInt();
            i=a;
        }
    }
}


