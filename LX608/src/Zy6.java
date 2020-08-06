public class Zy6 {
    /**
     * 打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
     */
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            if (shuiXian(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean shuiXian(int num){
        boolean d=false;
        int a= num/100;
        int b= num/10%10;
        int c= num%10;
        if (a*a*a+b*b*b+c*c*c==num){
            d=true;
        }
        return d;
    }
}
