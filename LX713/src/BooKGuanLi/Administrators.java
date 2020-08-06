package BooKGuanLi;

import java.util.LinkedList;
import java.util.List;

public class Administrators{

    List<Book> list=new LinkedList<>();

    public void add (Book book){

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
