package shuju.yewu;
import shuju.BookDao;
import shuju.BookDaoJieKou;
import java.util.List;
import java.util.Scanner;

public class Administrator {

    //注入数据层
    private BookDaoJieKou bookDao = new BookDao();

    Scanner sc=new Scanner(System.in);
    public void choice(){

        out:while (true){
            System.out.println("请选择操作:   1.添加图书   2.删除图书    3.查看全部图书   4.用编号查看图书    5.修改图书    6.退出");
            int i=sc.nextInt();
            switch (i){
                case 1:
                    System.out.println("请添加您想添加的图书");
                    addBook();
                    break ;

                case 2:
                    System.out.println("您想删除哪些图书");

                    delBook();
                    break ;
                case 3:
                    System.out.println("欢迎查看全部图书");

                    lookAllBook();
                    break ;
                case 4:
                    lookIdBook();
                    break ;
                case 5:
                    System.out.println("欢迎修改图书");

                    modifyBook();
                    break ;
                case 6:
                    System.out.println("期待下次相遇.....");
                    break out;

                default:
                    System.out.println("请您正确输入");

                    break ;
            }
        }
    }
    //1.添加图书   2.删除图书    3.查看全部图书   4.用编号查看图书    5.修改图书

    //添加图书
    public void addBook(){

        System.out.println("添加图书");
        System.out.println("请输入图书编号");
        String id=sc.next();
        Book book = bookDao.iDLookBook(id);

        if (book == null) {

            System.out.println("请输入书名");
            String title=sc.next();

            System.out.println("请输入图书作者");
            String author= sc.next();

            System.out.println("请输入图书单价");
            double price = sc.nextDouble();

            System.out.println("请输入图书数量");
            int num= sc.nextInt();

            bookDao.addBook(new Book(id,title,author,price,num));
            System.out.println("您已成功添加"+id+" "+title+" "+author+" "+price+" "+num);

        }else {
            System.out.println("该书已存在修改数量即可");
            System.out.println("您想修改的数量");
            int num=sc.nextInt();
            bookDao.modifyBook(id,num);
            System.out.println("您已成功修改"+id+" 为 "+num+"本");

        }
    }
    //删除图书
    public void delBook(){
        System.out.println("删除图书");
        System.out.println("请输入想删除图书的id");
        String id=sc.next();
        bookDao.delBook(id);
        System.out.println("您已成功删除 "+id+" 的书");

    }
    //查看全部图书
    public void lookAllBook(){
//        System.out.println("查看全部图书");
        System.out.println("图书编号  图书名称   图书作者   图书单价  图书数量  图书总价");
        List<Book> list = bookDao.lookBook();
        for (Book b:list) {
            if (b != null && !list.isEmpty()){
                print(b);
            }else {
                System.out.println("仓库还未进书");
            }
        }
    }

    //用编号查看图书
    public void lookIdBook(){
        System.out.println("用编号查看图书");
        System.out.println("请输入查看图书的id");
        String id=sc.next();

        Book book = bookDao.iDLookBook(id);
        if (book != null) {
            System.out.println("图书编号  图书名称   图书作者   图书单价  图书数量  图书总价");
            print(book);

        }else {
            System.out.println("仓库中还没有，请选择添加图书");
        }

    }
    //修改图书
    public void modifyBook(){
        System.out.println("修改图书的id");
        String id=sc.next();
        System.out.println("您想修改的数量");
        int num=sc.nextInt();
        bookDao.modifyBook(id,num);
        System.out.println("您已成功修改"+id+" "+num);

    }
    public void print(Book book){
        System.out.println(book.getId()+"  "+book.getTitle()+"  "+book.getAuthor()+"   "+book.getPrice()+"   "+book.getNum()+"  "+book.getMoney());
    }
}
