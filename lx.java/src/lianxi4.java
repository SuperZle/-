public class lianxi4 {
    public static void main(String[] args){
        int x=8;
        int y=9;
        //System.out.println("x:"+x+ "y:"+y);
        /*++x;
        --y;
        System.out.println("x:"+x+ "y:"+y);
        x--;
        y++;
        System.out.println("x:"+x+ "y:"+y);*/
        //这里先赋值，后运算
        int A=x++;
        int B=y--;
        /*这里先运算，后赋值
        int A=++x;
        int B=--y;*/
        /*int C=A++;
        int D=B--;
        int E=A++;
        int F=B++;
        int q=A--;
        int W=B;*/
        System.out.println(x);
        System.out.println(y);
        //System.out.println("x:"+x+ "y:"+y);
        System.out.println(A);
        System.out.println(B);
        /*System.out.println(q);
        System.out.println(W);*/


    }


}
