public class bijiaoyunsuan {
    public static void main(String[] args) {
        int a=5;
        int b=9;
        String str="zg";
        //==,!=,<,>,<=,>=,【instanceof(检查是否为类的对象)】这里的所有结果都是boolean类型ture/false
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(str instanceof String);
        //System.out.println(a instanceof int);这就是错的基本类数据类型不能用instanceof
        Integer c=5;//包装类
        System.out.println(c instanceof Integer);
    }
}
