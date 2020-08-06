import java.util.Scanner;

public class LX2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入1~1000");
        int i=sc.nextInt();
        double random=Math.random();//[0,1)  1~10
        int d=(int)(random*1000)+1;//1~1000
        //控制输入次数
        for (int c=1;c<50;c++) {
            if (i == d) {
                System.out.println("中奖了");
                break;
                } else if (i > d) {
                    System.out.println("大了,继续");
                } else {
                    System.out.println("小了，继续");
                }
            System.out.println("请再次输入1~1000");
            int a=sc.nextInt();
            i=a;
        }
    }
}


