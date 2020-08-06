import java.util.Scanner;

public class CeShi {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("员工编号");
            YuanG yg1=new YuanG(sc.nextInt());
            System.out.println(yg1);
        }
}
