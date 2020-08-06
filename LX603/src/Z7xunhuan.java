public class Z7xunhuan {
    /**
     * 使用while循环计算1-100之间的和
     * @param args
     */
    public static void main(String[] args) {
        int i=0;
        //用sum来做和的变量名
        int sum=0;
        while (i<100){
            i++;
            System.out.println(i);//1-100
            sum+=i;
        }
        System.out.println(sum);//5050
    }
}
