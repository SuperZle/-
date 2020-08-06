public class TriangleFun {
    public static void fun(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n ; j++) {
                if (i==1){
                    if (j == n/2 ){
                        System.out.print("*" );
                    }
                    System.out.print(" ");
                }
                else if (i<=n/2){
                    if (j >= n/2 - (i - 1) && j <= n/2 + (i - 1)) {
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }else {
                    if (j >= i+1-n/2 && j <= 1.5*n-i-1){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        fun(10);
    }
}
