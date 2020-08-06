public class LanHan {

    private static LanHan duixiang;

    private LanHan(){}

    public synchronized static LanHan fun(){

        if (duixiang==null){

            duixiang= new LanHan();
        }
        return duixiang;
    }

    public static void main(String[] args) {
        LanHan fun = LanHan.fun();
    }
}
