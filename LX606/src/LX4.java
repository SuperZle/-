public class LX4 {
    public static void main(String[] args) {
        for (int i = 5; i >0 ; i--) {
            for (int j = 0; j <=i ; j++) {
                if (j>=i){
                    System.out.print("*");
                }else{
                    System.out.println("");
                }
            }
            System.out.println();
        }
    }
}
