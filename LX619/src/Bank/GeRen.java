package Bank;

public class GeRen extends Bank{

    public GeRen(String name, String password, double balance, String num) {
        super(name, password, balance, num);
    }

    public GeRen() {
    }

    //存定期
    public  void inmoney(double d,int i){
        System.out.println(" 您的个人账户"+super.getName()+" 已存"+d+"元定期  "+"存期为:"+i+"个月");
        super.setBalance(d+super.getBalance());
    }

    //取款
    public void outmoney(double d){
        System.out.println(" 您的个人账户"+super.getName()+" 已取"+d+"元"+"当前余额为:"+super.getBalance());
        super.setBalance(super.getBalance()-d);
    }

}
