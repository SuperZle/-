/**
 * Administrator
 * current user 张++
 * 2020/7/6 0006
 * current system date
 * 14:13
 * current system time
 * 2020
 * current year
 */


public class XianSet {
    public static void main(String[] args) {
        NewXian n1=new NewXian("张");
        NewXian n2=new NewXian("王");
        NewXian n3=new NewXian("李");
        NewXian n4=new NewXian("刘");
        n1.start();
        n4.start();
        n3.start();
        n2.start();
        n1.setPriority(Thread.MAX_PRIORITY);
        n2.setPriority(Thread.MIN_PRIORITY);


//        System.out.println(n1.getName());
//        System.out.println(n2.getName());
//        System.out.println(n3.getName());
//        System.out.println(n4.getName());

    }
}
