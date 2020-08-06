public class Lx1 {
    public static void main(String[] args) {
        for (int i = 24; i <10000 ; i++) {
            if (perfect(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean perfect(int num){
        int k=0;
        for (int i = 1 ; i < num ; i++) {
            if (num%i == 0){
                k+=i;
            }
        }
        if (num == k){
            //System.out.println(num);
            return true;
        }
        return false;
    }
}

