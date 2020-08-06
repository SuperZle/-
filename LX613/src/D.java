public class D {
    public static void main(String[] args) {
        int[] i = {5, 3, 85, 1, 6, 1, 8};
        String S = new String("");
        for (int j = 0; j < i.length; j++) {
            for (int k = j + 1; k < i.length; k++) {
                if (i[j] > i[k]) {
                    int t = i[j];
                    i[j] = i[k];
                    i[k] = t;
                }
            }
            System.out.print(i[j]);
        }
    }
}
