public class JiaMi {
    /**
     * 某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下
     * ：每位数字都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换
     */
    public static void main(String[] args) {

    }
    public static void fun(int n){
        int a=(n/1000+5)%10;
        int b=(n/100%10+5)%10;
        int c=(n/10%10+5)%10;//n%100/10
        int d=(n%10+5)%10;

    }
}
