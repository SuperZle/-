public class a {
    public static void main(String[] args) {
        a test=new a();
        int i=0;
        test.test1(i);
        i=++i;
        System.out.print(i);
    }
    public void test1(int i){
        i++;
    }
}

