public class suanshu2 {
    public static void main(String[] args) {
        short s=1;
        int i=1;
        //s=i; //就是错误的。此处short的取值范围比int小”如将short换成byte也一样“  只能由小范围赋值给大范围
        i=s;
        //short s=1,s+1;是错误的因为s+1系统默认s为int数据类型。可以将s+1变为short(s+1)或者s+=1
        System.out.println(i);


    }
}
