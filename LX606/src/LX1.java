public class LX1 {
    public static void main(String[] args) {
        int i=5;
        float f=1.2F;
        //i=f; 出现错误，float精度比int高。如果要转则需强制转换 有一下两种解决方法
        int i1=(int)f+i;
        i+=f;//有强转的功能
        f=i;
    }
}
