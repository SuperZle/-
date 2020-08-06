package BooKGuanLi;

import java.util.*;

public class Library extends Administrators{

    public void choice(int i){
        switch (i) {
            case 1 :{
                System.out.println("欢迎管理员登陆");

                break;
            }
            case 2: {
                System.out.println("欢迎上帝关顾");
                break;
            }
            case 3: {

                System.out.println("期待下次相遇");
                break;
            }
            default:
                System.out.println("请重新输入");
        }
    }




//    List<Book> list=new LinkedList<>();
//
//    public void add (Book book){
//
//        list.add(book);
//
//    }
    public void look(){

        System.out.println("图书编号  "+"图书名称      "+" 图书作者  "+" 图书单价  "+"图书数量 "+" 图书总价");

        for (Book b:list
             ) {
            System.out.println(b);
        }
    }


    public void delete(Book book){

    }

}
