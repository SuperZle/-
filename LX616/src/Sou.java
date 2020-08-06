public class Sou extends Father{
    String name="我是儿子";
    public void fun(String n){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        fun1();
        this.fun();
        //只能是父类
        super.fun();
    }
    public void fun1(){
        System.out.println("我是子类的第二个方法");
    }
    public static void main(String[] args) {
        Sou er=new Sou();
        er.fun("子类");
        //System.out.println();
    }
}
