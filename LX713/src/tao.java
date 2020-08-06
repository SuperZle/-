/**
 * current user 张++
 * 2020/7/28 0028
 * 8:57
 * 2020
 */


public class tao {
    public static void main(String[] args) {
        int fun = fun(7);
        System.out.println(fun);
    }
    public static int fun(int n){
        if (n==1){
            return 1;
        }
        return 2*fun(n-1)+2;
    }
}
