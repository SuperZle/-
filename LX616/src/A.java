public class A {
    public static void main(String[] args) {
        for (int i = 1; i < 5 ; i++) {
            for (int j = 4; j > 0 ; j--) {
                if (i>=j){
                System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 5; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
