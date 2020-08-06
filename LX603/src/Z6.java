public class Z6 {
    /**
     *     春 3，4，5
     *     夏 6，7，8
     *     秋 9，10，11
     *     冬 12 ，1， 2
     *     2.使用switch语句判断
     * @param args
     */
    public static void main(String[] args) {
        int i=22;
        switch (i){
            default:
                System.out.println("请输入正确月份");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("冬");
                break;
                //defult语句可以放在前面
        }
    }
}


