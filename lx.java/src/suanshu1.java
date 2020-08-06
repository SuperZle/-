public class suanshu1 {
    public static void main(String[] args) {
        int a=12;
        int b=15;
        //以下的运算符有强制数据类型提升的功能
        /*a+=b;//相当于a=a+b 12+15 27
        System.out.println(a);
        a/=b;//相当于a=a/b 12/15 0
        System.out.println(a);*/
        a%=b;//相当于a=a%b 12%15 12
        System.out.println(a);
        int x=3;
        int y=4;
        System.out.println(x/y);//这里因为int为整数故输出为0
        System.out.println(x*1.0/y);//x乘1.0后输出为0.75
        System.out.println(x/y*1.0);//提升为double数据类型输为出0.0
        System.out.println((x/y)*1.0);//也是提升数据类型输出为0.0

    }
}
