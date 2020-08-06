public class Zy3 {
    /**
     * int[] a = {23,36,12,27,52}; 从小到大排序。
     */
    public static void main(String[] args) {
        int[] a={23,36,12,27,52};
        //调用排序方法，
        paixu(a);
        for (int z:a){
        System.out.println(z);
        }
    }
    public static void paixu(int[] a){
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                //上面的大于下面的
                if (a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
}
