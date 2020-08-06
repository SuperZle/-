package shuju;

import com.sun.org.apache.regexp.internal.RE;
import shuju.yewu.Book;

import java.util.*;

public class BookDao implements BookDaoJieKou{

    //仓库集合
    private static Map<String,Book> bookMap=new HashMap();
    //购物车集合
    private static Map<String,Book> cartMap=new HashMap();


    static {

        bookMap.put("1001",new Book("1001","海的女儿  ","安徒生",10.0,100));
        bookMap.put("1002",new Book("1002","安徒生童话","安徒生",15.0,10));
        bookMap.put("1003",new Book("1003","悲惨世界  ","雨果 ",25.5,1000));
        bookMap.put("1004",new Book("1004","西游记   ","吴承恩",12.0,100));

    }

    //查询书  将书放在集合中
    @Override
    public List<Book> lookBook() {
        Collection<Book> values = bookMap.values();
        List<Book> list=new ArrayList<>(values);
        return list;
    }

    //按编号查询
    @Override
        public Book iDLookBook(String id) {

        return bookMap.get(id);
    }

    //添加书
    @Override
    public void addBook(Book book) {

        bookMap.put(book.getId(),book);
    }

    //修改图书
    @Override
    public void modifyBook(String id,int num) {

        Book book = bookMap.get(id);
        book.setNum(num);

    }

    //删除图书
    @Override
    public void delBook(String id) {
        bookMap.remove(id);

    }

    //向购物车添加图书
    @Override
    public void addCart(Book book) {
        cartMap.put(book.getId(),book);
    }

    //查看购物车
    //必须的返回书的集合
    @Override
    public List<Book> lookCart() {
        Collection<Book> values = cartMap.values();
        ArrayList<Book> books = new ArrayList<>(values);
        return books;
    }

    //清空我购物车
    @Override
    public void clearCart() {
        cartMap.clear();
    }

    //查看购物车中是否已有该图书
    @Override
    public Book iDCartBook(String id) {
        return cartMap.get(id);
    }

    //修改购物车书籍的数量
    @Override
    public void modifyCartBook(String id, int num) {
        Book book = cartMap.get(id);
        book.setNum(num);
    }

}
