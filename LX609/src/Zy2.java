public class Zy2 {
    /**
     * 5！+4！+3!+2!+1!
     */
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <= 5 ; i++) {
            sum+=MyTools.factorial(i);
        }
        System.out.println(sum);
    }
}
