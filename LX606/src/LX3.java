public class LX3 {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 0; a <10 ; a++) {
            for (int b = 0; b <10 ; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int c = 0; c <10 ; c++) {
            for (int d = 10; d >c ; d--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
