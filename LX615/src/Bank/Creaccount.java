package Bank;

import java.text.SimpleDateFormat;
import java.util.Date;

    public class Creaccount {
            //用户名
            private String pername;
            //密码
            private long password;
            //余额
            private double balance;
            //信用额度
            private double creditlimit=100000;
            Creaccount(){}
            Creaccount(String pername, long password, double balance, double Creditlimit){
                this.pername="张三";
                this.password=888888;
                this.balance=0;
                this.creditlimit=100000;
            }

            //查看卡号
            public void cardnumber(String s) {
                if (s.equals("查看卡号")) {
                    System.out.println("您的卡号为:8888888888888888");
                }else{
                    System.out.println("您输入有误，请重新输入");
                }
            }

            //查看余额
            public void balance(String s){
                if (s.equals("查看余额")){
                    System.out.println("您的账户的余额为:"+balance);
                }else{
                    System.out.println("您输入有误，请重新输入");
                }
            }

            //设置信用额度
            public void setquota(String s,int i){
                if (s.equals("设置信用额度")){
                    System.out.println("请设置您的信用额度");
                    this.creditlimit=i;
                    System.out.println("您现在的信用额度为:"+i);
                }else {
                    System.out.println("您输入有误，请重新输入");
                }
            }

            //存款
            public double deposit(String s,double d){
                int i=0;

                if (s.equals("存款")){
                    if (d>100000){
                        i++;
    //                    DecimalFormat big=new DecimalFormat("0.0");
    //                    String format = big.format(creditlimit * (1 + 0.1 * i));
    //                    System.out.println("--------------------"+format);
                        this.creditlimit=Math.round(creditlimit*(1+0.1*i));
                    System.out.println("您已经存款"+d+"元   当前余额为:"+(d+balance)+"元"+"  当前的信用额度为:"+this.creditlimit+"元");
                    }else {
                        System.out.println("您已经存款"+d+"元"+" 当前余额为:"+(d+balance)+"元");
                    }
                }else{
                    System.out.println("您输入有误，请重新输入");
                }
               balance=d+balance;
                return balance;
            }

            //取款
            public double draw(String s,double d){
                Date date=new Date();
                SimpleDateFormat adf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
                String format = adf.format(date);
                if (s.equals("取款")){
                    int i=0;
                    i++;
                    if (d<Math.round(creditlimit*0.2)){
                        System.out.println("因为您本次取款金额小于"+(Math.round(creditlimit*0.2))+"元"+"  我行将收取取款金额的1%，为:"+(Math.round(d*0.01)+"元"));
                        System.out.println("您本次取款为:"+d+"元   共付利息:"+(Math.round(d*0.01))+"元"+" 当前余额为:"+(balance-d-d*0.01));
                        if (i<=3){
                            System.out.println(format+"时  您本次取款为:"+d+"元"+" 当前余额为:"+(balance-d-d*0.01));
                        }
                        balance=balance-d-(Math.round(d*0.01));
                        return balance;
                    }else {
                        System.out.println("您本次取款为:"+d+"元"+" 当前余额为:"+(balance-d));
                        if (i<=3){
                            System.out.println(format+"时 您本次取款为:"+d+"元"+" 当前余额为:"+(balance-d));
                        }
                        balance=balance-d;
                        return balance;
                    }
            }else {
                    System.out.println("您输入有误，请重新输入");
                }
                return balance;
    }
}
