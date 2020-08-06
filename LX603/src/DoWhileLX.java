public class DoWhileLX {
    public static void main(String[] args) {
        int i=0;
        int a=0;
        do {
            i++;
            a+=i;
            System.out.println(i);//1-100
        }while(i<100);
        System.out.println(a);//5050
    }
}
