public class lianxi {
    public static void main(String[] args) {
        int i=50;
        //为了控制输入的数据有误
        if (i<0 || i>100){
            System.out.println("输入有误");
        }
        else if (i<=100 && i>=90){
            System.out.println("优秀");
        }
        else if (i<=89 && i>=80){
            System.out.println("好");
        }
        else if (i<=79 && i>=70){
            System.out.println("良");
        }
        else if (i<=69 && i>=60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
    }
}
