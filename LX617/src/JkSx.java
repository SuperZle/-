public class JkSx implements Jk{
    @Override
    public double d(double a, double b) {
        return a*b;
    }

    @Override
    public void fun() {
        System.out.println("我是接口的实现方法,我相当与子类");
    }
}
