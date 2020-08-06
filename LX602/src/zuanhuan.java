public class zuanhuan {
    public static void main(String[] args) {
        //范围；byte，short，char<int<long<float<double
        //自动转换 byte short char 参与运算时自动转换为int类型
        byte b=5;
        System.out.println(b+1);//此时已经升级为int类型
        short s=5;
        System.out.println(s+1);
        char c=5;
        System.out.println(c+1);
        byte b1=5;
        int i=4;
        //byte a1=1+b1; //byte范围较小无法接受int类型的
        int a=i+b1;
        short s1=8,s2=9,s3;
        //s3=s1+s2; 错误：s1和s2为变量,参与运算后升级为int类型
        s3=2+6;//2和6为常量
        int s4;
        s4=s1+s2;
        //强制转换  大范围的可以接受小范围的
        //格式：数据类型  变量名 =（数据类型）被转换的值
        //如：int i=（int）1.5
        int d=(int)1.5;
        
    }
}
