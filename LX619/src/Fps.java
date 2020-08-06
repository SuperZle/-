public class Fps {
    public static void main(String[] args) {
        for (int i = 1; i < 40; i++) {
            for (int j = 1; j < 40 ; j++) {
                if (i==1){
                    if (j == 21){
                        System.out.print("*" );
                    }
                        System.out.print(" ");
                }
                if (i == 7){
                    if (j == 1){
                        System.out.print("*");
                    }
                    else if (j <= 14){
                    System.out.print(" * ");
                    }
                    else if (j == 15){
                        System.out.print("*");
                    }
                    else {
                    System.out.print("");
                    }
                }
                else if (i <14 && i > 7 || i > 1 && i < 7){
                    if (j == 21 - (i - 1) || j == 21 + (i - 1) || j == 5*i-35 || j == 77-5*i) {
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }else if (i == 14){
                    if (j == 21 - (i - 1) || j == 21 + (i - 1)){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
//                else {
//                    if (j == i-14 || j == 44-i){
//                        System.out.print("*");
//                    } else{
//                        System.out.print(" ");
//                    }
//                }
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
