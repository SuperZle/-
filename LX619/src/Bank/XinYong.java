package Bank;

public class XinYong extends Bank{
    private double credit;

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public XinYong(String name, String password, double balance, String num, double credit) {
        super(name, password, balance, num);
        this.credit = credit;
    }

    public XinYong(){}

    public void inmoney(double d){
        if (d>100000){
            System.out.println(" 您的信用账户"+super.getName()+" 已存"+d+"元"+"当前余额为:"+super.getBalance()
                    +"您的信用额度涨了:"+(this.getCredit()*0.1)+"您的信用额度为:"+(this.getCredit()*1.1));
            this.setCredit(this.getCredit()*1.1);
        }

        System.out.println(" 您的信用账户"+super.getName()+" 已存"+d+"元"+"当前余额为:"+super.getBalance());
    }

    public void outmoney(double d){
        if (d<(this.getCredit()*0.2)){
            System.out.println(" 您的信用账户"+super.getName()+" 已取"+d+"元"+"当前余额为:"+super.getBalance());

        }
        System.out.println(" 您的信用账户"+super.getName()+" 已取"+d+"元"+"当前余额为:"+super.getBalance());
        super.setBalance(super.getBalance()-d);
    }
}
