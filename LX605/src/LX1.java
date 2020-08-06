public class LX1 {
    public static void main(String[] args) {
        int i=1;
        int a=3;
        int b=0;
//        a=i++ + ++i;
//        System.out.println(a);
//                      或      并且
          boolean f=i++<2 ||++i<6 && 6<5;
          System.out.println(f);
          System.out.println(i);
    }
}
