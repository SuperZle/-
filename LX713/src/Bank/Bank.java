package Bank;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Bank {

    private String atname;
    private int password;
    double balance;
    private static String[] s1=new String[3];
    private static String[] s2=new String[3];


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
//查看的方法
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

    public static void fun1(int i,String s){
        if (i == 3){
            i=0;
        }
        s1[i]=s;
        //int j=i%3;
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
//        String format = sdf.format(date);
    }

    public static void fun2(int i,String s){
        if (i == 3){
            i=0;
        }
        s2[i]=s;
        //int j=i%3;
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
//        String format = sdf.format(date);
    }


    public static void fun11(){
        for (int j = 0; j < s1.length; j++) {
            if (s1[j] != null){
                System.out.println(s1[j]);
            }
        }
    }

    public static void fun22(){
        for (int j = 0; j < s2.length; j++) {
            if (s2[j] != null) {
                System.out.println(s2[j]);
            }
        }
    }
}
