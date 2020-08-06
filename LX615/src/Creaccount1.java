import java.text.SimpleDateFormat;
import java.util.Date;

    public class Creaccount1 extends BankTest{

            //信用额度
            private double creditlimit=100000;

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
