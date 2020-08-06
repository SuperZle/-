import java.util.ArrayList;
import java.util.List;

/**
 * current user 张++
 * 2020/7/18 0018
 * 12:14
 * 2020
 */
//给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度。
//
// 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
//
// 示例 1:
//
// 给定 nums = [1,1,1,2,2,3],
//
//函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3 。
//
//你不需要考虑数组中超出新长度后面的元素。
//
// 示例 2:
//
// 给定 nums = [0,0,1,1,1,1,2,3,3],
//
//函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。
//
//你不需要考虑数组中超出新长度后面的元素。
//
//
// 说明:
//
// 为什么返回数值是整数，但输出的答案是数组呢?
//
// 请注意，输入数组是以“引用”方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
//
// 你可以想象内部操作如下:
//
// // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
//int len = removeDuplicates(nums);
//
//// 在函数里修改输入数组对于调用者是可见的。
//// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
//for (int i = 0; i < len; i++) {
//    print(nums[i]);
//}
// Related Topics 数组 双指针
// 👍 249 👎 0


//leetcode submit region begin(Prohibit modification and deletion)



//        List<Integer> list=new ArrayList<>();
//        for (int i:ints
//        ) {
//            list.add(i);
//        }
//        System.out.println(list);
//        for (int i = 0 ; i < ; i++) {
//
//        }
//        List<Integer> list=new ArrayList<>();
//
//        for (int i:ints
//             ) {
//            list.add(i);
//
//        }
//        System.out.println(list);
//        for (int i = list.size()-1; i >= 0   ; i--) {
//            int n=0;
//
//            for (int j = i-1; j >= 0 ; j--) {
//                int a=list.get(i);
//                int b=list.get(j);
//                if (a!=b){
//                    continue;
//                }else{
//                    n++;
//                    if (n>=2){
//                        list.remove(j);
//                    }
//
//                }
//            }
//        }
//        System.out.println(list);
public class T80删除排序数组中的重复项 {
    public static void main(String[] args) {
        int[] ints= {3,3,3,3,5,5,5,4,4};
        removeDuplicates(ints);

    }
    public static int removeDuplicates(int[] nums) {


        //放进集合中便于删除
        List<Integer> list=new ArrayList<>();
        for (int i:nums
        ) {
            list.add(i);
        }
//        System.out.println(list);

        for (int i = 0; i < list.size() ; i++) {

            int a=list.get(i);
            int n=0;
            List<Integer> list1=new ArrayList<>();
            for (int j = i+1; j < list.size() ; j++) {
                int b=list.get(j);
                if (a == b){
                    n++;
                    if (n>1){
                        list1.add(j);
                    }
                }
            }
//            System.out.println(list1+"------------------");

            for (int j = 0; j < list1.size(); j++) {
                int w=list1.get(0);
                //int 表示索引
                list.remove(w);
            }
//            System.out.println(list);
        }
        for (int i = 0; i < list.size(); i++) {
            int c=list.get(i);
            nums[i]=c;
        }

//        System.out.println(list);
        return list.size();
    }
}
