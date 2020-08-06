import java.util.Arrays;

/**
 * Administrator
 * current user 张++
 * 2020/7/6 0006
 * current system date
 * 9:51
 * current system time
 * 2020
 * current year
 */

//你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
// 如果两间相邻的房屋在同一晚上
//被小偷闯入，系统会自动报警。
//
// 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
//
//
//
// 示例 1：
//
// 输入：[1,2,3,1]
//输出：4
//解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
//     偷窃到的最高金额 = 1 + 3 = 4 。
//
// 示例 2：
//
// 输入：[2,7,9,3,1]
//输出：12
//解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
//     偷窃到的最高金额 = 2 + 9 + 1 = 12 。
//
//
//
//
// 提示：
//
//
// 0 <= nums.length <= 100
// 0 <= nums[i] <= 400
//
// Related Topics 动态规划
// 👍 918 👎 0


//leetcode submit region begin(Prohibit modification and deletion)



public class T198打家劫舍 {
    public static void main(String[] args) {
        int[] ints={2,7,9,3,1};
        int rob = rob(ints);
        System.out.println(rob);
    }
    public static int rob(int[] nums) {

        int n=0;
        int m=0;
        int a=0;
        int max=0;
        int[] ints = Arrays.copyOfRange(nums, 0, nums.length);
        Arrays.sort(ints);

        for (int i = 0; i < nums.length; i++) {
            if (i%2==0){
                n+=nums[i];
            }else {
                m+=nums[i];
            }
            max = Math.max(n, m);
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums.length==ints[ints.length-1]){
                a=i;
            }
        }

//        for (int i = 0; i < nums.length; i++) {
//            if (i%3==0){
//                a+=nums[i];
//            }
//        }
        return max;
    }
}
