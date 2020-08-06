public class Triangle {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 4; j >= 1 ; j--) {
                for (int k = 4; k < 10; k++) {
                    if (i == j){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
}
