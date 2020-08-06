public class lianxi1 {
    public static void main(String[] args) {
        int a = 0;
        for (int i= 0; i<= 100; i++) {
            if (i%2 == 0){//偶数
                System.out.println(i);
                a += i;
            }
        }
        System.out.println(a);//2550
    }
}
