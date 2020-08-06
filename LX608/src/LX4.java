public class LX4 {
    /**
     * 将整形数组中的元素首尾依次两两交换
     * @param args
     */
    public static void main(String[] args) {
        //就是个数组
        int[] i={12,541,121,1215,215,1,};//length就是数组中有多少个数
//        调用j(i)方法
        int[] ii = j(i);
//        输出方法中数组中的数
        for (int z:ii) {
            System.out.println(z);
        }
    }
    public static int[] j(int[] i){
//          数组中第一个数     最后一个
        for (int a = 0,k = i.length-1; a < i.length/2 ; a++,k--) {
            int temp=i[a];
            i[a]=i[k];
            i[k]=temp;
        }
        return i;
    }
}
