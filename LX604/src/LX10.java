public class LX10 {
    public static void main(String[] args) {
        boolean c=bo(5,8);
        System.out.println(c);
    }
    public static boolean bo(int a, int b){
        boolean c=false;
        if (a==b){
            c=true;
        }else{
            c=false;
        }
        return c;
    }
}
