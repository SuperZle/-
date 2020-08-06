public class Test{
    private int count ;
    public static void main(String[] args){
        Test s = new Test(99);
        System.out.println(s.count);
    }
    Test(int ballcount){
        count = ballcount ;
    }
}