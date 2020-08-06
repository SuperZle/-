public class Zy5 {
    /**
     *3.输出101-200之间的素数及个数。(素数是：只能被1或本身整除的数，
     * 如：3,5,7,11,131... )
     */
    public static void main(String[] args) {
        int j=0;
        for (int i = 101; i <=200 ; i++) {
            if (sushu(i)){
                System.out.println(i);
                j++;
            }
        }
        System.out.println("共有"+j+"个素数");
    }
    public static boolean sushu(int num){
        if (num>1 && num<=3){
            return true;
        }
        for (int i = 2; i < num/2 ; i++) {
            if (num%i == 0){
            return false;
            }
        }return true;
    }
}
