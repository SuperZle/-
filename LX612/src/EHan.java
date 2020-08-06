public class EHan {//饿汉
    //创建一个私有，静态的对象
    private static EHan duixiang =new EHan();
    //创建一个私有的无参数的构造方法
    private EHan(){}
    //创建一个公共静态的返回该类对象的方法
    public static EHan fun(){
        return duixiang;
    }
}
class ddd{
    public static void main(String[] args) {
        EHan fun = EHan.fun();
    }
}

