public class AbsLxTest {

    public static void main(String[] args) {

        AbsLx absLx = new AbsLx() {
            @Override
            public void fun1() {
                System.out.println("有名的");
            }

            @Override
            public void fun2(String s) {
                System.out.println("=================");
            }

            @Override
            public String fun3(String s) {
                return "------------++++++++++";
            }
        };
        absLx.fun1();
        String s = absLx.fun3("5555555555");
        absLx.fun2("66666666");
        System.out.println(s);

        new AbsLx(){
            @Override
            public void fun1() {
                System.out.println("无名的");
            }

            @Override
            public void fun2(String s) {
                System.out.println("=================");
            }

            @Override
            public String fun3(String s) {
                return "------------++++++++++";
            }
        }.fun1();
    }
}
