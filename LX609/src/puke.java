import java.util.Random;
import java.util.Scanner;

public class puke {
    public static void main(String[] args) {
        String[] pk1={"红心A","红心2","红心3","红心4","红心5","红心6","红心7","红心8","红心9","红心10","红心J","红心Q","红心K","方块A","方块2","方块3","方块4","方块5","方块6","方块7","方块8","方块9","方块10","方块J","方块Q","方块K","黑桃A","黑桃2","黑桃3","黑桃4","黑桃5","黑桃6","黑桃7","黑桃8","黑桃9","黑桃10","黑桃J","黑桃Q","黑桃K","梅花A","梅花2","梅花3","梅花4","梅花5","梅花6","梅花7","梅花8","梅花9","梅花10","梅花J","梅花Q","梅花K"};
        Random random = new Random();
        //Scanner sc=new Scanner(System.in);
        for (int j = 1; j < 20; j++) {
            int i=random.nextInt(52);
            int i1=random.nextInt(52);
            int i2=random.nextInt(52);
            if (i1!=i && i1!=i2 && i!=i2) {
                String s = pk1[i];
                String s1 =pk1[i1];
                String s2 =pk1[i2];
                System.out.println(s);
                System.out.println(s1);
                System.out.println(s2);
                System.out.println("-------------------");
                break;
            }
        }

    }



}
