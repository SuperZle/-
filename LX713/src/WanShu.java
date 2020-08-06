/**
 * current user 张++
 * 2020/7/14 0014
 * 12:24
 * 2020
 */


public class WanShu {
    public static void main(String[] args) {

        System.out.println(fun(1));
        for (int i = 1; i < 10000; i++) {
            if (fun(i)) {
                System.out.println(i);
            }
        }

    }
    public static boolean fun(int i){

//        if (i==1){
//            return false;
//        }

        int a=0;

        for (int j = 1; j < i; j++) {
            if (i%j==0){
                a+=j;
            }
        }

        if (a==i){
            return true;
        }

        return false;

    }
}
