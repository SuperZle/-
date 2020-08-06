public class AbClassTest {
    public static void main(String[] args) {
        //多态  父类  变量名 = new 子类
        AbClass ab=new BaClass();
        ab.ab();
        ab.abc();
        AbClass ac=new AcClass();

    }
}
