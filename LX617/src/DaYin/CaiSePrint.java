package DaYin;

public class CaiSePrint extends Print{
    private String img;

    public CaiSePrint() {}

    public CaiSePrint(String name, double momey, String img) {
        super(name, momey);
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void fun(){
        System.out.println("我是彩色打印机");
    }
}
