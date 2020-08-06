public class JkTest {
    public static void main(String[] args) {
        JkSx jkSx=new JkSx();
        double d = jkSx.d(5.1, 4.01);
        System.out.println(Math.round(d));
        jkSx.fun();
        //多态  父类  变量名=new 子类();  优先打印子类的
        Jk jk=new JkSx();
        double d1 = jk.d(2.1, 3.1);
        System.out.println(d1);
        jk.fun();
    }
}
