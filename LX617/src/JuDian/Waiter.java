package JuDian;

public class Waiter extends Person implements LianJie{
    //创建服务员类   厨师和服务员都有对客人的vip服务   服务员的vip服务   倒酒
    @Override
    public String work() {
        return "在上菜";
    }
    public String vip(){
        return "倒酒";
    }
}
