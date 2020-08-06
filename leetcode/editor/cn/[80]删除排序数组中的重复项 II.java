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
class Solution {
    public int removeDuplicates(int[] nums) {
        //放进集合中便于删除
        List<Integer> list=new ArrayList<>();
        for (int i:nums
        ) {
            list.add(i);
        }
//        System.out.println(list);
//       遍历集合
        for (int i = 0; i < list.size() ; i++) {

            int a=list.get(i);
            int n=0;
//           将相同的数的位置放进新集合中
            List<Integer> list1=new ArrayList<>();
            //与后面的元素比较
            for (int j = i+1; j < list.size() ; j++) {
                //用int才能用==
                int b=list.get(j);
                if (a == b){
                    n++;
                    //判断相同几次  只能相等一次
                    if (n>1){
                        list1.add(j);
                    }
                }
            }
//            System.out.println(list1+"------------------");
//          将相同的索引位置上的元素删除    相当于第一次将与第一个相同的2个以外的删除
            for (int j = 0; j < list1.size(); j++) {
                //删除索引时size会减小所以每次都删第一个索引位置
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
//leetcode submit region end(Prohibit modification and deletion)
