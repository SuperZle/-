import java.util.Scanner;

public class Z5_CXQD {
    /**
     *     春 3，4，5
     *     夏 6，7，8
     *     秋 9，10，11
     *     冬 12 ，1， 2
     *     1.使用if语句条件判断
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入月份");
        int i=scanner.nextInt();
        if (i<1 || i>12){
            System.out.println("请输入1~12月");
        }else if (i>=3 && i<=5){
            System.out.println("春");
        }else if (i>=6 && i<=8){
            System.out.println("夏");
        }else if (i>=9 && i<=11){
            System.out.println("秋");
        }else if (i==1 || i==12 || i==2){
            System.out.println("冬");
        }else{
            System.out.println("");
        }

    }
}
