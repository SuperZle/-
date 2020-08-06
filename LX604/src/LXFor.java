public class LXFor {
    public static void main(String[] args) {
        int d=0;
        for (int i =100; i <1000 ; i++) {
            int a=i/100;//百位数
            int b=i/10%10;
            int c=i%10;
            if (a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
    }
}

