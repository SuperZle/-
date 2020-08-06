public abstract class BankTest {
    private String atname;
    private int password;
    double balance;

    public String getAtname() {
        return atname;
    }

    public void setAtname(String atname) {
        this.atname = atname;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void look(String s){
        if (s.equals("查看卡号")){
            System.out.println("您的卡号为999999999999999");
        }
        if (s.equals("查看余额")){
            System.out.println("您的账户总余额为"+getBalance());
        }
    }
    public abstract double deposit(String s,double d);
    public abstract double draw(String s,double d);
}
