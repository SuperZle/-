public class Test{
    String s;
    String a;
    int i;

    public Test(String s, String a, int i) {
        this.s = s;
        this.a = a;
        this.i = i;
    }

    public Test() {
    }

    public void fun(){

        System.out.println("=======");
    }
    public void fun1(){

        System.out.println("++++++++++");
        this.fun();
    }
}