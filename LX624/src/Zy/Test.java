package Zy;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {

        Computer computer1=new Computer("联想",5000.0);

        Computer computer2=new Computer("dell",3500.0);

        Computer computer3=new Computer("苹果",6800.5);

        add(computer1);

        add(computer2);

        add(computer3);

        Book book1 = new Book("老人与海",10.0);

        Book book2 = new Book("红楼梦",50.0);

        add(book1);

        add(book2);

    }
    public static void add(Warehouse warehouse){

        Collection<Warehouse> coll=new ArrayList();

        if (warehouse instanceof Computer){

            Computer computer=(Computer)warehouse;

            coll.add(computer);

        }
        if (warehouse instanceof Book){

            Book book=(Book)warehouse;

            coll.add(book);

        }

       System.out.println(coll);

    }
}
