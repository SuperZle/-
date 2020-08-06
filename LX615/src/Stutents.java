import java.util.Random;
import java.util.Scanner;

public class Stutents {
    private String name;
    private int snum;
    private int sage;
    public  void shuru(){
        Scanner sc=new Scanner(System.in);
        String[] s=new String[10];
        System.out.println("输入格式为:姓名，学号，年龄");
        for (int i = 0; i < 10; i++) {
            System.out.println("输入"+(i+1)+"号学生信息");
            String sr = sc.nextLine();
            for (int j = 0; j < s.length; j++) {
                if (i == j){
                    s[i]=sr;
                }
            }
        }
        Random r=new Random();
        int k=r.nextInt(10);
        System.out.println("本次随机点名的是"+(k+1)+"号学生"+s[k]);
    }
    public static void main(String[] args) {
        Stutents s=new Stutents();
        s.shuru();
    }
}
