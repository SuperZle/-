//        for (int i=1;i<10;i++){
//            //变量j都是从1开始
//            for (int j=1; j<=i;j++) {
//                System.out.print(j+"*"+i+"="+(i*j));
//            }System.out.println();
//        }
public class Z1 {
    /**
     *1*1=1
     *1*2=2 2*2=2
     *1*3=3 2*3=6 3*3=9
     *..................9*9=81
     *
     */
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            //j每次都是从1开始
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+"*"+i+"="+i*j+"  ");
            }
            System.out.println();
        }
    }
}
