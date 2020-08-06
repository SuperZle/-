/**
 * Administrator
 * current user 张++
 * 2020/7/7 0007
 * current system date
 * 15:40
 * current system time
 * 2020
 * current year
 */


public class SiSuo {
    public static void main(String[] args) {

        SiSuo1 siSuo1=new SiSuo1();

        Thread t1 = new Thread(siSuo1, "小明");
        Thread t2 = new Thread(siSuo1, "小华");
        Thread t3 = new Thread(siSuo1, "小米");


        t1.start();
        t2.start();
        t3.start();

    }
}
