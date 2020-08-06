public class Zy4 {
    /**
     *将整形数组中的元素首尾依次两两交换
     */
    public static void main(String[] args) {
        int[] i={51,15,651,41,6,11,6};
        jiaohuan(i);
        for (int z:i){
            System.out.println(z);
        }
    }
    public static void jiaohuan(int[] i){
        /*for (int j = 0,k = i.length-1; j < i.length/2 ; j++,k--) {
            int temp=i[j];
            i[j]=i[k];
            i[k]=temp;
        }*/
        for (int j = 0; j < i.length; j++) {
            int temp=i[j];
            i[j]=i[i.length-1-j];
            i[i.length-1-j]=temp;
        }
    }
}
