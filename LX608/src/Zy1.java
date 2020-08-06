public class Zy1 {
    /**
     * 求和： 5！+4！+3！+2！+1!
     * @param args
     */
    public static void main(String[] args) {
        int i=0;
        for (int j = 1; j <= 5 ; j++) {
            int k=dicen(j);
            i+=k;
        }
        System.out.println(i);
    }
    public static int dicen(int num) {
        if (num == 1) {
            return 1;
        }
        return num * dicen(num - 1);
    }
}
