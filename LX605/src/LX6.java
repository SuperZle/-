import java.util.Scanner;

public class LX6 {
    public static void main(String[] args) {
        //dice骰子
        for (int i=1;i<51;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("第"+i+"次");
            int z=sc.nextInt();
            double a=Math.random();//[0,1)
            double b=Math.random();
            double c=Math.random();
            int dice1=(int)(a*6+1);
            int dice2=(int)(b*6+1);
            int dice3=(int)(c*6+1);
            //当三者都不一样：123,456
            if (dice1!=dice2 && dice1!=dice3 && dice2!=dice3){
                int dice = dice1 * 100 + dice2 * 10 + dice3;
                switch (dice){
                    case 123:
                    System.out.println(dice+"  你输了");
                    break;
                    case 132:
                    System.out.println(dice+"  你输了");
                    break;
                    case 213:
                    System.out.println(dice+"  你输了");
                    break;
                    case 231:
                    System.out.println(dice+"  你输了");
                    break;
                    case 321:
                    System.out.println(dice+"  你输了");
                    break;
                    case 312:
                    System.out.println(dice+"  你输了");
                    break;
                    case 456:
                    System.out.println(dice+"  你赢了");
                    break;
                    case 465:
                    System.out.println(dice+"  你赢了");
                    break;
                    case 546:
                    System.out.println(dice+"  你赢了");
                    break;
                    case 564:
                    System.out.println(dice+"  你赢了");
                    break;
                    case 645:
                    System.out.println(dice+"  你赢了");
                    break;
                    case 654:
                    System.out.println(dice+"  你赢了");
                    break;
                    default:
                    System.out.println(dice+"  重新输入");
                    continue;
                }
                return;
            }else if (dice1 == dice2 && dice1 != dice3 ) {
                switch (dice3) {
                    case 6:
                        int dice = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice + "  你赢了");
                        break;
                    case 1:
                        int dice8 = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice8 + "  你输了");
                        break;
                    default:
                        int dice5 = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice5 + "  继续比");
                        continue;
                }
                return;
            }else if(dice1 == dice3 && dice1 != dice2 ){
                    switch (dice2){
                    case 6:
                        int dice = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice+"  你赢了");
                        break;
                        case 1:
                        int dice9 = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice9 + "  你输了");
                            break;
                    default:
                        int dice6 = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice6+"  继续比");
                        continue;
                }
                return;
            }else if (dice2 == dice3 && dice2 != dice1 ){
                switch (dice1){
                    case 6:
                        int dice = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice+"  你赢了");
                        break;
                    case 1:
                        int dice10 = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice10 + "  你输了");
                        break;
                    default:
                        int dice7 = dice1 * 100 + dice2 * 10 + dice3;
                        System.out.println(dice7+"  继续比");
                        continue;
                }
                return;
            }else if(dice1 == dice2 && dice1 == dice3){
                int dice = dice1 * 100 + dice2 * 10 + dice3;
                System.out.println(dice+"  你赢了");
                break;
            }else{
                System.out.println();
                int m=sc.nextInt();
                z=m;
            }
        }
    }
}