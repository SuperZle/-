public class NetworkMaintenanceEngineer extends MaintenanceDepartment{
    /**
     * 继承  维修部
     * 网络维护工程师：员工号为xxx的 xxx员工，正在检查网络是否畅通
     */
    //网络维护工程师
    String id;
    public void fun(){
        System.out.println("网络维护工程师：员工号为"+getId()+"的 "+getName()+"员工，正在检查网络是否畅通");
    }
}
