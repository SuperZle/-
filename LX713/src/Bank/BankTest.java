package Bank;


public class BankTest {
/**
 * 银行案例【写完】
 *      扩展功能:   每一次取款都记录一个日志， 日志最多能存储3条数【记录近期的3条取款日志】
 *                  打印取款日志
 */
    public static void main(String[] args) {
    //创建一个个人账户
        Priaccount1 priaccount=new Priaccount1();

        priaccount.deposit("存定期",88888,12);
        priaccount.look("查看余额");
        priaccount.draw("取款",80000);
        priaccount.look("查看余额");
        priaccount.look("查看卡号");
        priaccount.draw("取款",80000);
        priaccount.look("查看余额");

        System.out.println("------------------");
    //创建一个信用账户
        Creaccount1 creaccount=new Creaccount1();

        creaccount.look("查看卡号");
        creaccount.deposit("存款",999999);
        creaccount.look("查看余额");
        creaccount.draw("取款",111111);
        creaccount.look("查看余额");
        creaccount.draw("取款",10000);
        creaccount.setquota("设置信用额度",999999);
        creaccount.look("查看余额");
        creaccount.deposit("存款",9999);
        creaccount.look("查看余额");
        creaccount.draw("取款",1000);
        creaccount.look("查看余额");
        creaccount.draw("取款",10000000);
        System.out.println("---------------------");
        Priaccount1.fun11();
        Creaccount1.fun22();
    }
}
