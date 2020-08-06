//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。 
//
// 说明： 
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？ 
//
// 示例 1: 
//
// 输入: [2,2,1]
//输出: 1
// 
//
// 示例 2: 
//
// 输入: [4,1,2,1,2]
//输出: 4 
// Related Topics 位运算 哈希表 
// 👍 1381 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {

        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();

        for (int i = 0 ; i < nums.length ; i++ ) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    set.add(nums[i]);
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            set1.add(nums[i]);
        }

        set1.removeAll(set);

        int z=0;
        for (Integer a:set1
        ) {
            z=a;
        }
        return z;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
