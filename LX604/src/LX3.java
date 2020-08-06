public class LX3 {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while (i<=100){
            i++;
            if (i%2!=1){
                System.out.println(i);//0-2-4-100
                sum+=i;
            }
        }System.out.println(sum);//2550
    }
}
