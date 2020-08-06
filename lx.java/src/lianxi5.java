public class lianxi5 {
    public static void main(String[] args) {
        int a=4;
        int b=a++ + ++a + a*10;
        System.out.println(a);
        System.out.println(b);
        int A=6;
        //  A=6  A=5 A=4  4*8    4
        int B=A-- + --A - A*8 + A++;//6+4-32+4
        System.out.println(A);//6-1-1+1
        System.out.println(B);//6+4-32+4
        int c=5;
        int d=c++;
        System.out.println(c);
        int x=8;
        int y=9;
        x++;
        y--;
        System.out.println("x:"+x+ "y:"+y);
    }
}
