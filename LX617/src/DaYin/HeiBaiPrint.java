package DaYin;

public class HeiBaiPrint extends Print{
    private String copy;

    public HeiBaiPrint() {}

    public HeiBaiPrint(String name, double momey, String copy) {
        super(name, momey);
        this.copy = copy;
    }

    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy;
    }

    public void fun(){
        System.out.println("我是黑白打印机");
    }
}
