public class LanHan {//懒汉
    //先创建一个私有的，静态的，默认的对象
    private static LanHan d;
    //创建一个私有的构造方法
    private LanHan(){}
    //创建一个公共的,同步的，返回LanHan的方法
    public synchronized static  LanHan fun(){
        if (d == null){
            d=new LanHan();
        }return d;
    }
}
class ff{
    public static void main(String[] args) {
        LanHan fun = LanHan.fun();
    }
}
