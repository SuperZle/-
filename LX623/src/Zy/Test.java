package Zy;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {

        //创建一个仓库

        Warehouse<Computer> warehouse=new Warehouse();

        warehouse.add(new Computer[]
                {
                        new Computer("联想", 5000.0),
                        new Computer("dell", 3500.0),
                        new Computer("苹果", 6800.5)
                }
        );

        warehouse.shuchu();

        Warehouse<Book> warehouse1=new Warehouse();
        warehouse1.add(new Book[]
                {
                        new Book("老人与海",10.0),
                        new Book("红楼梦",50.0)
                }
        );

        warehouse1.shuchu();

    }

}
