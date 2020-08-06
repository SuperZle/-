package DaYin;

public class ThPrint extends Print{
    private int pr;

    public ThPrint() {
    }

    public ThPrint(String name, double momey, int pr) {
        super(name, momey);
        this.pr = pr;
    }

    public int getPr() {
        return pr;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }

    public void fun(){
        System.out.println("我可以打印一个人");
    }
}
