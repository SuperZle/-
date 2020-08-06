package shuju.yewu.web;

import shuju.yewu.Administrator;
import shuju.yewu.Customer;

import java.util.Scanner;

public class Use {
    public static void main(String[] args) {
        System.out.println("----------------欢迎来到上元图书管理系统---------------------");
        //实例化业务层  管理员
        Administrator administrator=new Administrator();
        //顾客
        Customer customer = new Customer();
//      键盘输入
        Scanner sc=new Scanner(System.in);
        //系统里是个循环
        out :while (true){
            System.out.println("请输入登录用户   1.管理员       2.顾客       3.退出");
            int i=sc.nextInt();
            switch (i){
                case 1:
                    System.out.println("欢迎管理员登录");
                    administrator.choice();
                    break;
                case 2:
                    System.out.println("欢迎上帝登录");
                    customer.choice();
                    break;
                case 3:
                    System.out.println("期待下次相遇......");
                    break out;
                default:
                    System.out.println("请您正确输入");
                    break;
            }
        }
    }
}
