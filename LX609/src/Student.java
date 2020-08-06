public class Student {
    //成员变量
    String name;
    int age;
    String tel;
    //成员方法
    Student(){}
    public Student(String name,int age,String tel){
        this.name=name;
        this.age=age;
        this.tel=tel;
    }
    public void printMsg(){
        System.out.println("姓名: "+name+"  年龄: "+age+"  电话: "+tel);
    }


}
