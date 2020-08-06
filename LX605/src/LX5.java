import java.util.Scanner;

public class LX5 {
    public static void main(String[] args) {
        double a=Math.random();//[0,1)
        double b=Math.random();
        double c=Math.random();
        Scanner sc=new Scanner(System.in);
        //dice骰子
        for (int i=1;i<2;i++){
            System.out.println("第"+i+"次");
            int z=sc.nextInt();
            int dice1=(int)(a*6+1);
            int dice2=(int)(b*6+1);
            int dice3=(int)(c*6+1);
            //当三者都不一样：123,456

                        //三个都不相同
            if (dice1!=dice2 && dice1!=dice3 && dice2!=dice3){
                int dice = dice1 * 100 + dice2 * 10 + dice3;
                if (dice == 123){
                    System.out.println(dice+"你输了");
                    break;
                }
                if (dice == 456){
                    System.out.println(dice+"你赢了");
                    break;
                }
            }else if (dice1 == dice2 && dice1 != dice3 ) {
                switch (dice3) {
                    case 6:
                        int dice = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice + "你赢了");
                        break;
                    default:
                        int dice5 = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice5 + "继续比");
                        continue;
                }
            }else if(dice1 == dice3 && dice1 != dice2 ){
                    switch (dice2){
                    case 6:
                        int dice = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice+"你赢了");
                        break;
                    default:
                        int dice6 = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice6+"继续比");
                        continue;
                }
            }else if (dice2 == dice3 && dice2 != dice1 ){
                switch (dice1){
                    case 6:
                        int dice = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice+"你赢了");
                        break;
                    default:
                        int dice7 = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice7+"继续比");
                        continue;
                }
            }else if(dice1 == dice2 && dice1 == dice3){
                int dice = dice1 * 100 + dice2 * 10 + dice3;
                System.out.println(dice+"你赢了");
                break;
            }else{
                System.out.println("再输入一次");
            }
        }
    }
}