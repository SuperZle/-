package JuDian;
/**
 * 1）经理   服务员   厨师
 * 姓名 和员工编号
 * 经理 专门的奖金
 *
 * 2） 每类人都有工作 工作的形式不同的
 * 经理的工作 指挥干活
 * 厨师的工作  做菜
 * 服务员的工作  上菜
 *
 * 厨师和服务员都有对客人的vip服务
 * 厨师的vip服务是 菜加量
 * 服务员的vip服务   倒酒
 * 封装 继承  接口
 * 分析:人是抽象概念  所有的父类  抽象的工作  子类：经理 厨师  服务员
 * vip  厨师  服务员
 */
public abstract class Person {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract String work();
}
