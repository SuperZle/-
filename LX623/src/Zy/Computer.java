package Zy;

public class Computer {

    private String type;

    private double price;

    public Computer() {
    }

    public Computer(String type, double price) {

        this.type = type;

        this.price = price;
    }

    public String getType() {

        return type;
    }

    public double getPrice() {

        return price;
    }

    @Override
    //重写toString方法
    public String toString() {
        return "电脑 " + "type='" + type + '\'' + ", price=" + price ;
    }


}
