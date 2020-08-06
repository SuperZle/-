package BooKGuanLi;

public class Book  {
    //编号
    private String num;
    //书名
    private String title;
    //作者
    private String author;
    //单价
    private double price;
    //数量
    private int quantity;


    public Book() {
    }

    public Book(String num, String title, String author, double price, int quantity) {
        this.num = num;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return num + "     " +  title + "     "  + author + "     " + price +"     "+  quantity +"     " + getMoney();
    }


    public double getMoney() {

        return getPrice()*getQuantity();

    }

}
