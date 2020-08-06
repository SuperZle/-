public class ForLX {
    public static void main(String[] args) {
        //1~200中所有奇数的和
        int a=0;
        for (int i=0;i<=200;i++){
            if (i%2==1){//也可以改成（i%2！=0）
                //System.out.println(i);
                a+=i;
            }
        }
        System.out.println(a);
    }
}
