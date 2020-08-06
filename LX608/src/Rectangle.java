/**
 * 定义一个矩形Rect类，有两个方法，一个是计算周长，一个是计算面积
 */
public class Rectangle {
    public static void main(String[] args) {
        Rectangle.perimeter(10);
        Rectangle.thoa(20);
    }
    public static double perimeter(double d){
        double c=2*3.14*d;
        return c;
    }
    public static double thoa(double d){
        double s=3.14*d*d;
        return s;
    }
}
