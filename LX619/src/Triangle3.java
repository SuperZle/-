public class Triangle3 {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20 ; j++) {
                if (i==1){
                    if (j == 10 ){
                        System.out.print("*" );
                    }
                        System.out.print(" ");
                }
                else if (i<=10){
                    if (j == 10 - (i - 1) || j == 10 + (i - 1)) {
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }else {
                    if (j == i-9 || j == 29-i){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
        }
            System.out.println();
        }

//        for (int i = 1; i < 7; i++) {
//            for (int j = 1; j < 7; j++) {
//                if (i == j){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
    }
//    public static void fun(int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                //if (j = )
//            }
//
//        }
//    }
}
