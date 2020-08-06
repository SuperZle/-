    import java.text.SimpleDateFormat;
    import java.util.Date;

    public class Priaccount {
            private String atname;
            private int password;
            private double balance;
            Priaccount(){}

            Priaccount(String atname,int password,double balance) {
                this.atname = atname="张三";
                this.password=password=888888;
                this.balance=balance=0;
            }

            public void look(String s){
                if (s.equals("查看卡号")){
                    System.out.println("您的卡号为999999999999999");
                }
                if (s.equals("查看余额")){
                    System.out.println("您的账户总余额为"+balance);
                }
            }

            //double d是存款金额，int i是存的时长
            public double deposit(String s,double d,int i){
                if (s.equals("存定期")){
                    System.out.println("您已经存款"+d+"元定期  存期为:"+i+"月");
                }
                if (s.equals("存活期")){
                    System.out.println("您已存款"+d+"元");
                }
                balance=d+balance;
                return balance;
            }
            public double deposit(String s,double d){
                if (s.equals("存活期")){
                    System.out.println("您已存款"+d+"元");
                }
                balance=d+balance;
                return balance;
            }

            //取款
            public double draw(String s,double d){
                Date date=new Date();
                SimpleDateFormat adf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
                String format = adf.format(date);
                int i=0;
                if (s.equals("取款")){
                    if (d<=balance){
                        System.out.println("您已取款"+d+"元。 卡内余额为"+(balance-d));
                        i++;
                        if (i<=3){
                            System.out.println(format+"时  您取款"+d+"元");
                        }
                    }else {
                        System.out.println("您取款失败，余额不足     卡内余额为:"+balance+"元");
                    }
                }else{
                    System.out.println("您输入有误，请重新输入");
                }
                balance=balance-d;
                return balance-d;
            }

            //查看余额
            public void balance(String s){
                if (s.equals("查看余额")){
                    System.out.println("您的账户总余额为"+balance+"元");
                }else {
                    System.out.println("您输入有误，请重新输入");
        }
    }
}
