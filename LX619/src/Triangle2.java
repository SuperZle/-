public class Triangle2 {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++) {
            for (int j = 6; j >= 1 ; j--) {
                if (i == j){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("*  ");
        }
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                if (i == j){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
