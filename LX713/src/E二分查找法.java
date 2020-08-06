import DanLi.EHan;

/**
 * current user 张++
 * 2020/8/1 0001
 * 9:08
 * 2020
 */


public class E二分查找法 {
    public static void main(String[] args) {
        int[] ints={1,2,5,6,8,9,12,15,17,19,21,35};
        System.out.println(fun(ints,19));

    }
    public static int fun(int[] ints,int m){
        int left=0;
        int right=ints.length-1;
        while (left<right){
            int center=ints[(left+right)/2];
            if (center==m){
                return (left+right)/2;
            }else if (center<m){
                left=(left+right)/2;
            }else{
                right=(left+right)/2;
            }
        }
        return -1;

    }
}
