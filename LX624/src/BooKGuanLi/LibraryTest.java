package BooKGuanLi;

import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {
        //创建管理员
        Administrators administrators = new Administrators();
        //创建顾客
        Customer customer = new Customer();

        //创建一个图书馆
        Library library = new Library();
        System.out.println("----------------欢迎来到上元图书管理系统---------------------");
        System.out.println("请输入登录用户   1.管理员       2.顾客       3.退出");
        //选择登录     请输入登录用户   1.管理员       2.顾客       3.退出
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        library.choice(i);
        //管理员登录  添加图书
        //请选择操作:   1.添加图书   2. 删除图书      3.查看图书     4.退出
        for (int j = 0; j < 1000; j++) {

            System.out.println("请选择操作:   1.添加图书   2. 删除图书      3.查看图书     4.退出");
            int i1=sc.nextInt();
            administrators.choice(i1);
            System.out.println("您是否想继续操作退出请按4");
            int i2=sc.nextInt();
            if (i2==4)
                break;
        }



//        library.add(new Book("1001","海的女儿  ","安徒生",10.0,100));
//        library.add(new Book("1002","安徒生童话","安徒生",15.0,10));
//        library.add(new Book("1003","悲惨世界  ","雨果 ",25.5,1000));
//        library.add(new Book("1003","西游记   ","吴承恩",12.0,100));

        //查看
        //library.look();


    }
}
