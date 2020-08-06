package DaYin;

/**
 * 父类
 */
public class Print {
    //定义成员变量
    private String name;
    private double momey;

    public Print() {
    }

    public Print(String name, double momey) {
        this.name = name;
        this.momey = momey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMomey() {
        return momey;
    }

    public void setMomey(double momey) {
        this.momey = momey;
    }
}
