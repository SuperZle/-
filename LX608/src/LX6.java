public class LX6 {
    /**
     * 1 2 3 4 5 6 7   8  9 10
     * 1 1 2 3 5 8 13 21
     * @param args
     */
    public static void main(String[] args) {
        int digui = digui(3);
        System.out.println(digui);
    }
    public static int digui(int num){
        if (num==1 ||num==2) {
            return 1;
        }
        return digui(num-1)+digui(num-2);
    }
}
