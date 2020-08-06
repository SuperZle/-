public class Father extends Grandfather{
    String name="我是你爸爸";
    @Override
    public void fun(){

        System.out.println("我是父类的方法");
        fun1(1);
        super.fun();
    }
    public void fun1(int i){
        System.out.println(i);
    }
}
class Father1 extends Grandfather{
    String name="我是你爸爸";
//    @Override
//    public void fun(){
//        System.out.println("我是父类的方法");
//        fun2();
//        super.fun();
//    }
//    public void fun2(){
//
//    }
}