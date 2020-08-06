    public class Bank1 {
/**
 * 银行案例【写完】
 *      扩展功能:   每一次取款都记录一个日志， 日志最多能存储3条数【记录近期的3条取款日志】
 *                  打印取款日志
 */
    public static void main(String[] args) {
    //创建一个个人账户
        Priaccount priaccount=new Priaccount();


        priaccount.deposit("存定期",88888,12);
        priaccount.balance("查看余额");
        priaccount.draw("取款",80000);
        priaccount.balance("查看余额");
        priaccount.look("查看卡号");
        priaccount.draw("取款",80000);

        priaccount.balance("查看余额");

        System.out.println("------------------");
    //创建一个信用账户
        Creaccount creaccount=new Creaccount();

        creaccount.cardnumber("查看卡号");
        creaccount.deposit("存款",999999);
        creaccount.balance("查看余额");
        creaccount.draw("取款",111111);
        creaccount.balance("查看余额");
        creaccount.draw("取款",10000);
        creaccount.setquota("设置信用额度",999999);
        creaccount.balance("查看余额");
        creaccount.deposit("存款",9999);
        creaccount.balance("查看余额");
        creaccount.draw("取款",1000);
        creaccount.balance("查看余额");
        creaccount.draw("取款",10000000);
    }
}
