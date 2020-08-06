public class Ehan {

    public static Ehan  duixiang=new Ehan();

    private Ehan(){}

    public static Ehan fun(){

        return duixiang;

    }

    public static void main(String[] args) {
        Ehan fun = Ehan.fun();
    }
}
