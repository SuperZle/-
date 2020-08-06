import java.util.Random;

public class ClassQ {
    //定义一个班级
    //创建一个学生数组
     private Stutents1[] stu=new Stutents1[10];
//    ClassQ(int i){
//        String[] stu=new String[i];
//    }

    public void setStu(Stutents1[] stu) {
        this.stu = stu;
    }
//    public void setStu(int i) {
//        this.stu.length = i;
//    }

    //添加学生进班级
    public void add(int index,Stutents1 student){
        stu[index]=student;
    }
    //打印学生信息
    public void print(){
        for (int i = 0; i < stu.length; i++) {
            //从数组中一个个打印出来
            Stutents1 stu1=stu[i];
            System.out.println("姓名:"+stu1.getName()+" 学号:"+stu1.getSnum()+" 年龄"+stu1.getSage());
        }
    }
    //随机点名一个学生
    public void rand(){
        Random random=new Random();
        //从数组中随机点一个人
        int i=random.nextInt(stu.length);
        Stutents1 stu1=stu[i];
        System.out.println("本次随机点名的学生是"+i+"号学生  姓名为;"+stu1.getName()+"\t学号"+stu1.getSnum()+"\t年龄"+stu1.getSage());
    }
}
