public class Ract {
    /**
     * (1)编写一个矩形类Rect，包含：
     * 	矩形的宽(width[int])；矩形的高(height[int])。
     * 	两个构造方法：
     *     1．一个带有两个参数的构造方法，用于将width和height属性初化；
     *     2．一个不带参数的构造方法，将矩形初始化为宽和高都为10。
     *         两个方法：
     *         求矩形面积的方法area()
     *         求矩形周长的方法perimeter()
     */
    int width;
    int height;
    Ract(int width,int height) {}
    Ract(){
        this.width=10;
        this.height=10;
    }
    public  int area(int width,int height){
        return width*height;
    }
    public  int perimeter(int width,int height){
        return 2*(width+height);
    }
}
