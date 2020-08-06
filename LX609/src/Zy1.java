public class Zy1 {
    /**
     * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
     *
     * 2,2,4,6,10,16,26,42
     */
    public static void main(String[] args) {
        int i=total(7);
        System.out.println(i);
    }
    public static int total(int n){
        if (n==1 ||n==2){
            return 2;
        }
        return total(n-2)+total(n-1);
    }
}
