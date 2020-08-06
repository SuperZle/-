/**
 * Administrator
 * current user 张++
 * 2020/7/7 0007
 * current system date
 * 11:20
 * current system time
 * 2020
 * current year
 */


public class MainThread {
    public static void main(String[] args) {
        //创建一个仓库
        CangKuThread ck=new CangKuThread();
        CangKuThread1 cangKuThread1=new CangKuThread1();
        //创建三个对象
        Thread t1= new Thread(ck,"computer");
        Thread t2= new Thread(ck,"phone");
        Thread t3= new Thread(ck,"open");
//        t1.start();
//        t2.start();
//        t3.start();
        Thread t4= new Thread(cangKuThread1,"computer");
        Thread t5= new Thread(cangKuThread1,"phone");
        Thread t6= new Thread(cangKuThread1,"open");
        t4.start();
        t5.start();
        t6.start();
    }
}
