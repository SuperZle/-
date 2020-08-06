package SiSuo;

/**
 * current user 张++
 * 2020/7/13 0013
 * 15:30
 * 2020
 */


public class SiSuo {

    public static void main(String[] args) {
        SiSuo1 siSuo1=new SiSuo1();
        //创建线程
        Thread t1=new Thread(siSuo1,"小玲");
        Thread t2=new Thread(siSuo1,"小明");
        Thread t3=new Thread(siSuo1,"小红");
        t1.start();
        t2.start();

    }
}
