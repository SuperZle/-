package Bank;

public class Bank {
    private String name;
    private String password;
    private double balance;
    private String num;

    public Bank(String name, String password, double balance, String num) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.num = num;
    }

    public Bank() {
    }

    public String getNum() {
        return num;
    }

//    public void setNum(String num) {
//        this.num = num;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getPassword() {
        return password;
    }

//    public void setPassword(String password) {
//        this.password = password;
//    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void look() {
    }

    public  void inmoney() {
        System.out.println(" 您的个人账户"+this.getName()+" 已存"+this.getBalance());
    }
    public  void outmoney() {

    }
}

