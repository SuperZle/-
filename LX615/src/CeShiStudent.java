import java.util.Scanner;

public class CeShiStudent {
    //在班级中添加学生   输入姓名  编号  年龄
    //1.创建一个班级
    public static void main(String[] args) {
        ClassQ A208=new ClassQ();
        //A208.setStu(stu);
        //创建学生    需要从键盘输入信息
        Scanner scanner=new Scanner(System.in);
        String name;
        String snum;
        int sage;
        Stutents1 stu1;
        //录入信息
        for (int i = 0; i < 10; i++) {
            System.out.println("欢迎"+(i+1)+"号学生加入A208班级");

            System.out.println("请输入姓名");
            name=scanner.next();

            System.out.println("请输入学号");
            snum=scanner.next();

            System.out.println("请输入年龄");
            sage=scanner.nextInt();
            //创建空对象
            stu1 =new Stutents1();

            stu1.setName(name);
            stu1.setSnum(snum);
            stu1.setSage(sage);

            A208.add(i,stu1);


}
        //打印学生信息
        A208.print();
        //随机点名一个人
        A208.rand();
    }




}
