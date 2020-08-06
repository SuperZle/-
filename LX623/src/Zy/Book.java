package Zy;

public class Book {

    private String title;

    private double price;

    public Book() {
    }

    public Book(String title, double price)
    {

        this.title = title;

        this.price = price;

    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "书籍 " + "title='" + title + '\'' + ", price=" + price;
    }


}
