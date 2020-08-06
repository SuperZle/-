package shuju;

import shuju.yewu.Book;

import java.util.List;

/**+
 * 图书管理系统中分为三层
 * 用户层 就是main方法存在的，也是测试类   相当于客户端  有选择登录选项
 * 业务层  使用数据，修改数据 管理员的选项  和  客户的选项
 * 数据方法层   数据接口的实现层
 * 数据的接口 可有可无
 * Book类
 * 编程框架思维
 */

public interface BookDaoJieKou {
    //查询书  将书放在集合中
    List<Book> lookBook();

    //按编号查询
    Book iDLookBook(String id);

    //添加书
    void addBook(Book book);

    //修改图书
    void modifyBook(String id,int num);

    //删除图书
    void delBook(String id);

    //加入购物车
    void addCart(Book book);

    //查看购物车
    List<Book> lookCart();

    //结账
    void clearCart();

    //查看购物车中是否已有该图书
    Book iDCartBook(String id);

    //修改购物车书籍的数量
    void modifyCartBook(String id,int num);


}
