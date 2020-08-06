public class pig {
    String name;
    int age;
    {
        int j=5;
        System.out.println(j);
    }
    static  int i;
    static {
        i=9;
        System.out.println(i);
    }

     pig(){
        System.out.println("非静态");
    }
    public static void w(){

    }
    public void a(){

    }
    public static void main(String[] args) {
        pig p=new pig();
    }
}
