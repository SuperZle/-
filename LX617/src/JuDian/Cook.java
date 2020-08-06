package JuDian;

public class Cook extends Person implements LianJie{
    //创建厨师类   厨师和服务员都有对客人的vip服务  厨师的vip服务是 菜加量
    @Override
    public String work() {
        return "我在做菜";
    }
    public String vip(){
        return "菜加量";
    }
}
