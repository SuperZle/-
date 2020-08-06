public class HomeWorkExtends {
    /**
     * 某IT公司有多名员工，按照员工负责的工作不同，进行了部门的划分（研发部员工、维护部员工）。研发部根据所需研发的内容不同，
     * 又分为JavaEE工程师、Android工程师；维护部根据所需维护的内容不同，又分为网络维护工程师、硬件维护工程师。
     * 公司的每名员工都有他们自己的员工编号、姓名，并要做它们所负责的工作。
     * 工作内容
     * JavaEE工程师：员工号为xxx的 xxx员工，正在研发淘宝网站
     * Android工程师：员工号为xxx的 xxx员工，正在研发淘宝手机客户端软件
     * 网络维护工程师：员工号为xxx的 xxx员工，正在检查网络是否畅通
     * 硬件维护工程师：员工号为xxx的 xxx员工，正在修复打印机
     * 请根据描述，完成员工体系中所有类的定义，并指定类之间的继承关系。进行XX工程师类的对象创建，完成工作方法的调用。
     */
    public static void main(String[] args) {
        JavaEEEngineer javaEEEngineer=new JavaEEEngineer();
        javaEEEngineer.fun();
        AndroidEngineer androidEngineer=new AndroidEngineer();
        androidEngineer.fun();
        NetworkMaintenanceEngineer networkMaintenanceEngineer=new NetworkMaintenanceEngineer();
        networkMaintenanceEngineer.fun();
        HardwareMaintenanceEngineer hardwareMaintenanceEngineer=new HardwareMaintenanceEngineer();
        hardwareMaintenanceEngineer.fun();
    }
}
