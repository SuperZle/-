import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class T26删除排序数组中的重复项 {

    public static void main(String[] args) {
        int[] ints={1,1,2,2,3};
        int i = removeDuplicates(ints);

    }

    public static int removeDuplicates(int[] nums) {

        Set<Integer> set=new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);

        }
        Iterator<Integer> iterator = set.iterator();

        for (int i = 0; i < set.size(); i++) {
            while (iterator.hasNext()){
                nums[i]=iterator.next();
                break;
            }
        }
        return set.size();


    }
}
