package Bank;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Priaccount1 extends Bank {
        private int i=0;
        //double d是存款金额，int i是存的时长
        public double deposit(String s,double d,int i){
            if (s.equals("存定期")){
                System.out.println("您已经存款"+d+"元定期  存期为:"+i+"月");
            }
            balance=d+balance;
            return balance;
        }
        @Override
        public double deposit(String s, double d){
            if (s.equals("存款")){
                System.out.println("您已存款"+d+"元");
            }
            balance=d+balance;
            return balance;
        }

        //取款
        @Override
        public double draw(String s, double d){
            if (s.equals("取款")){
                if (d<=balance){
                    System.out.println("您已取款:"+d+"元。 卡内余额为"+(balance-d));
                    Priaccount1.fun1(i,"日志:您个人账户取款:"+d+"元。 卡内余额为"+(balance-d));

                    i++;
                }else {
                    System.out.println("您取款失败，余额不足     卡内余额为:"+balance+"元");
                    Priaccount1.fun1(i,"日志:您个人账户取款失败，余额不足     卡内余额为:"+balance+"元");

                    i++;
                }
            }else{
                System.out.println("您输入有误，请重新输入");
            }
            balance=balance-d;
            return balance-d;
        }
}
