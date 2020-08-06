package shuju.yewu;

import com.sun.org.apache.regexp.internal.RE;
import org.omg.CORBA.PUBLIC_MEMBER;
import shuju.BookDao;
import shuju.BookDaoJieKou;

import java.util.List;
import java.util.Scanner;

public class Customer {
    //注入数据层
    private BookDaoJieKou bookDao = new BookDao();

    Scanner sc=new Scanner(System.in);
    public void choice(){

        out :while (true){
            System.out.println("请选择操作:    1.查看全部图书   2.加入购物车    3. 查看购物车     4.结账   5.退出");

            int i=sc.nextInt();
            switch (i){
                case 1:
                    System.out.println("欢迎查看全部图书");
                    lookAllBook();
                    break;
                case 2:
                    System.out.println("请选择您想要加入购物车的图书");

                    inCart();
                    break;
                case 3:
                    System.out.println("欢迎查看购物车");

                    lookCart();
                    break;
                case 4:
                    System.out.println("感谢购买上元图书");

                    clearCart();
                    break;
                case 5:
                    System.out.println("期待下次相遇......");

                    break out;

                default:
                    System.out.println("请您正确输入");

                    break ;
            }
        }
    }
    //1.查看全部图书   2.加入购物车    3. 查看购物车     4.结账
    //查看全部图书

    public void lookAllBook(){

        System.out.println("图书编号  图书名称   图书作者   图书单价  图书数量  图书总价");
        //返回一个图书集合
        List<Book> list = bookDao.lookBook();
        //遍历集合
        for (Book b:list) {
            if (b != null && !list.isEmpty()){
                print(b);
            }else {
                System.out.println("仓库还未进书");
            }
        }
    }
    //加入购物车
    public void inCart(){

        System.out.println("请输入您想添加图书的id");
        String id=sc.next();
        //查看仓库中是否有该图书
        Book book = bookDao.iDLookBook(id);
        //查看购物车中是否有该图书
        Book book1 = bookDao.iDCartBook(id);
        if ( book == null ){
            System.out.println("请输入正确的编号");
            return;
        }else if ( book1 == null ){

            //获取仓库中所有该书的数量
            //int oldBookNum=book.getNum();
            System.out.println("请输入您想要购买的数量");
            int num=sc.nextInt();
            if (num>book.getNum()){
                System.out.println("很抱歉，库存不足");
                return;
            }else {
                    //添加图书进购物车
                    //修改购物车中该书的数量
                    book1=new Book(id,book.getTitle(),book.getAuthor(),book.getPrice(),num);

                    bookDao.addCart(book1);
                    System.out.println("您已成功添加" + num + "本" + book.getTitle() + "加入购物车");

                    //刷新仓库中的书籍数量
                    bookDao.modifyBook(id,book.getNum()-num);

                    //book.setNum(book.getNum()-num);
                }

        //仓库里有购物车中也有
        }else {
            System.out.println("您的购物车中已经有该书，您还想再买几本吗");
            System.out.println("您还想再购买几本");
            int num1 = sc.nextInt();
            if (num1<=book.getNum()){
            bookDao.modifyCartBook(id,num1+book1.getNum());
            //刷新仓库中的书籍数量
            bookDao.modifyBook(id,book.getNum()-num1);
            }else {
                System.out.println("很抱歉，库存不足");
                return;
            }
        }
    }
    //查看购物车
    public void lookCart(){
        //返回图书集合
        List<Book> list = bookDao.lookCart();

        if (list != null && !list.isEmpty()){
            System.out.println("图书编号  图书名称   图书作者   图书单价  图书数量  图书总价");
            for (Book b:list) {
                System.out.println(b.getId()+"  "+b.getTitle()+"  "+b.getAuthor()+"   "+b.getPrice()+"   "+b.getNum()+"  "+b.getMoney());
            }
        }else{
            System.out.println("您的购物车为空");
        }
    }
    //结账
    public void clearCart(){
        List<Book> list = bookDao.lookCart();
        for (Book b:list) {
            System.out.println("您本次买了:"+b.getNum()+"本"+b.getTitle()+" 消费"+b.getMoney());
        }
        bookDao.clearCart();


        System.out.println("恭喜购买到喜欢的书籍");
    }
    public void print(Book book){
        System.out.println(book.getId()+"  "+book.getTitle()+"  "+book.getAuthor()+"   "+book.getPrice()+"   "+book.getNum()+"  "+book.getMoney());
    }

}
