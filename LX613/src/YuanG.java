public class YuanG {
    /**
     * 创建一个员工类，类中有如下属性
     * 姓名(eName[String])、工号(eNum[int])、基本工资(baseSal[float])、出勤率(chuqin[float])
     * 类中有一个计算员工月薪的方法calSalary,计算公式为:月薪 = 基本工资 + 基本工资*出勤率
     * <p>
     * 要求：在控制台输入员工编号，打印数员工信息，包含员工的所有属性
     */
    String eName;
    int eNum;
    float baseSal;
    float chuqin;
    YuanG(){}
    String[] s={"姓名:张三,基本工资:5000000,出勤率:0.8,本月工资:","姓名:张李四,基本工资:500000,出勤率:0.7,本月工资:"};
    YuanG(int eNum) {
        switch (eNum) {
            case 001: {
                System.out.println(s[0] + (YuanG.calSalary(5000000, 0.8F)));
                break;
            }
            case 002: {
                System.out.println(s[1] + (YuanG.calSalary(500000, 0.7F)));
                break;
            }
        }
    }
    public static float calSalary(float baseSal,float chuqin){
        return baseSal+baseSal*chuqin;
    }
}
