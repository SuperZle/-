class Emp {
    //成员变量
    String eName;
    int eNum;
    float baseSalary;
    float attendance;
    public Emp() {
    }
    public Emp(String eName, int eNum, float baseSalary) {
        this.eName = eName;
        this.eNum = eNum;
        this.baseSalary = baseSalary;
    }
    public Emp(String eName, int eNum, float baseSalary, float attendance) {
        this.eName = eName;
        this.eNum = eNum;
        this.baseSalary = baseSalary;
        this.attendance = attendance;
    }
    //成员方法
    public float calSalary(){
        return baseSalary + baseSalary * attendance;
    }
}
class Dept {
    String dName;
    int dNum;
    Emp[] emps; //一个部门有多个员工
    public Dept() {
    }
    public Dept(String dName, int dNum) {
        this.dName = dName;
        this.dNum = dNum;
    }
    public Dept(String dName, int dNum, Emp[] emps) {
        this.dName = dName;
        this.dNum = dNum;
        this.emps = emps;
    }
    public void remove(Emp emp){
        for (int i = 0; i < emps.length; i++) {
            if(emps[i].eNum == emp.eNum) {
                emps[i] = null;
                System.out.println(emp.eName+"员工已离职！");
            }
        }
    }
    public void add(Emp emp){
        boolean flag = true;
        for (int i = 0; i < emps.length ; i++) {
            if(emps[i] == null) {
                emps[i] = emp;
                System.out.println(emp.eName+"员工入职成功！");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("员工满员！");
        }
    }
}
public class Test5 {
    public static void main(String[] args) {
        // Emp[] emps = new Emp[10];
//        Dept d1 = new Dept("人事",1,emps);
        //创建部门
        Dept d1 = new Dept("人事",1,new Emp[5]);
        Emp tony = new Emp("托尼",1,10000,1.0f);
        d1.add(tony);
        d1.add(new Emp("汤姆1",2,5000,0.9f));
        d1.add(new Emp("汤姆2",3,5000,0.6f));
        d1.add(new Emp("汤姆3",4,5000,0.8f));
        d1.add(new Emp("汤姆4",5,5000,0.5f));
        d1.add(new Emp("汤姆5",6,5000,0.6f));
        for (int i = 0; i <d1.emps.length ; i++) {
            float salary = d1.emps[i].calSalary();
            System.out.println(d1.emps[i].eName +" "+salary);
        }
        d1.remove(tony);
//        d1.remove(new Emp("汤姆3",4,5000,0.8f));  error
    }
}
