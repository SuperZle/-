public class LX1 {
    public static void main(String[] args) {
        int a;
        for (a=0;a<3;a++){//这里a++第一步并不自增.走完一次循环自增一次
            a=a+1;//a+=1;
            System.out.println(a);//3
        }
    }
}
