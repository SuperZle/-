package JuDian;

public class TestHotel {
    //测试酒店的运行环境
    public static void main(String[] args) {
        //创建一个经理
        Manager manager = new Manager();
        manager.setMoney(10000.0);
        manager.setName("小明");
        manager.setId("1001");
        System.out.println(manager.getId()+"经理"+manager.getName()+"的奖金为:"+manager.getMoney()+"元");
        System.out.println(manager.getId()+"经理"+manager.getName()+manager.work());
        //创建大厨
        Cook cook = new Cook();
        cook.setName("张大厨");
        cook.setId("2001");
        System.out.println(cook.getId()+cook.getName()+cook.work());
        System.out.println(cook.getId()+cook.getName()+"给顾客"+cook.vip());
        //创建两个服务员
        Waiter waiter1 = new Waiter();
        waiter1.setName("王一号服务员");
        waiter1.setId("3001");
        System.out.println(waiter1.getId()+waiter1.getName()+waiter1.work());
        System.out.println(waiter1.getId()+waiter1.getName()+"给顾客"+waiter1.vip());
        Waiter waiter2 = new Waiter();
        waiter2.setName("王二号服务员");
        waiter2.setId("3002");
        System.out.println(waiter2.getId()+waiter1.getName()+waiter2.work());
        System.out.println(waiter2.getId()+waiter1.getName()+"给顾客"+waiter2.vip());
    }
}
