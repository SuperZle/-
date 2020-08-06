public class Fin {
    public static void main(String[] args) {
        int[] i={1,2,5,64};
        final int[] j=i;
        final int[] j1;
        //i={5, 2, 6};
        for (int k = 0; k < j.length; k++) {
            System.out.println(j[k]);
        }
    }
}
