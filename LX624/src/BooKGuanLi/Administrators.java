package BooKGuanLi;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Administrators {
    //请选择操作:   1.添加图书   2. 删除图书      3.查看图书     4.退出

   public void choice(int i1){
       switch (i1){
           case 1:{
               System.out.println("请输入想添加的图书,本次可以添加五次，如不想继续添加请输入NO,添加格式为:图书编号  图书名称   图书作者   图书单价  图书数量  图书总价");
               for (int i = 0; i < 5; i++) {
                   Scanner sc=new Scanner(System.in);
                   System.out.println("请输入图书编号");
                   String s=sc.next();
                   System.out.println("请输入图书名称");

                   String s1=sc.next();
                   System.out.println("请输入图书作者");

                   String s2=sc.next();
                   System.out.println("请输入图书单价");

                   double d=sc.nextDouble();
                   System.out.println("请输入图书数量");

                   int i11=sc.nextInt();
                   Book book=new Book(s,s1,s2,d,i11);
                   add(book);
                   System.out.println("您已成功添加"+book.getQuantity()+"本名为:"+book.getTitle()+"的书");
                   System.out.println("您是否想继续添加图书，继续添加输入1，不想则2");
                   int i22=sc.nextInt();
                  if (i22 == 2)
                       break;
                   }
               break;
           }
           case 2:{
               System.out.println("请输入想删除的图书");
               break;

           }
           case 3:{
              look();
              break;

           }
           case 4:{
               System.out.println("期待下次相遇");
               break;

           }
           default:
               System.out.println("请重新输入");

       }
   }

    List<Book> list=new LinkedList<>();

    public void add (Book book){

//        Book book= new Book();
        list.add(book);

    }
    public void look(){

        System.out.println("图书编号  "+"图书名称      "+" 图书作者  "+" 图书单价  "+"图书数量 "+" 图书总价");

        for (Book b:list
        ) {
            System.out.println(b);
        }
    }

}
