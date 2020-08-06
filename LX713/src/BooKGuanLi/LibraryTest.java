package BooKGuanLi;

import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {
        System.out.println("----------------欢迎来到上元图书管理系统---------------------");
        System.out.println("请输入登录用户   1.管理员       2.顾客       3.退出");
        //创建一个图书馆
        Library library = new Library();
        //选择登录     请输入登录用户   1.管理员       2.顾客       3.退出
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        library.choice(i);
        //管理员登录  添加图书



        library.add(new Book("1001","海的女儿  ","安徒生",10.0,100));
        library.add(new Book("1002","安徒生童话","安徒生",15.0,10));
        library.add(new Book("1003","悲惨世界  ","雨果 ",25.5,1000));
        library.add(new Book("1003","西游记   ","吴承恩",12.0,100));

        //查看
        library.look();


    }
}
