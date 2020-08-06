import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * current user 张++
 * 2020/7/18 0018
 * 14:22
 * 2020
 */


public class b {
    static int m=0;
    public static void main(String[] args) {
        int[] ints={1,1,1,1};
        System.out.println(Arrays.toString(removeDuplicates(ints)));

    }
    public static int[] removeDuplicates(int[] nums) {
        if (m==nums.length-1){
            return nums;
        }
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        for (int i:nums
        ) {
            list.add(i);
        }
        int a=list.get(m);

        int n=0;
        for (int i = m+1; i < list.size(); i++) {
            int b=list.get(i);
            if (a==b){
                n++;
                if (n > 1){
                    list1.add(i);
                }
            }
            continue;
        }
        for (int c:list1
             ) {
            nums[c]=0;
        }
        for (int i = 0; i < nums.length-list1.size(); i++) {
            if (nums[i]!=0){
                list2.add(nums[i]);
            }
        }
        int[] d=new int[list.size()];
        for (int i = 0; i < d.length; i++) {
            d[i]=list2.get(i);
        }
        m++;
        return removeDuplicates(d);
    }

}
