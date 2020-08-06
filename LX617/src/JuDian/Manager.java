package JuDian;

public class Manager extends Person{
    //创建酒店经理类  经理 专门的奖金
    private double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String work() {
        return "我是指挥干活的";
    }
}
