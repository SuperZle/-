import java.util.ArrayList;
import java.util.List;

/**
 * current user 张++
 * 2020/7/28 0028
 * 14:19
 * 2020
 */
//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
//
// 你的算法时间复杂度必须是 O(log n) 级别。
//
// 如果数组中不存在目标值，返回 [-1, -1]。
//
// 示例 1:
//
// 输入: nums = [5,7,7,8,8,10], target = 8
//输出: [3,4]
//
// 示例 2:
//
// 输入: nums = [5,7,7,8,8,10], target = 6
//输出: [-1,-1]
// Related Topics 数组 二分查找
// 👍 522 👎 0


//leetcode submit region begin(Prohibit modification and deletion)


public class T34在排序数组中查找元素的第一个和最后一个位置 {
    public static void main(String[] args) {
        int[] nums = {15, 1, 2, 6, 5, 6, 5, 6, 2, 99, 6, 64, 654, 54, 4, 564, 4, 4, 564,
                1564, 54, 54, 59, 48, 54, 51, 42, 584, 57, 45, 4, 54, 5, 4, 54, 54524, 484,
                1564, 54, 54, 59, 48, 54, 51, 42, 584, 57, 45, 4, 54, 5, 4, 54, 54524, 4841564, 54, 54, 59, 48, 54, 51, 42, 584, 57, 45, 4, 54, 5, 4, 54, 54524, 484,
                1564, 54, 54, 59, 48, 54, 51, 42, 584, 57, 45, 4, 54, 5, 4, 54, 54524, 4848888
                , 4, 894, 44, 41, 4, 1, 8, 48, 4, 84, 8, 55, 5,};
        int a = 4848888;
//        System.out.println(fun(nums,a));
        for (int i = 0; i < nums.length; i++) {
            if (a == nums[i]) {
                System.out.println(i);
            }
        }

    }

    public static int fun(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            //中间的 会自动转为整数
            int min = (left + right) / 2;
            if (nums[min] == target) {
                return min;
            } else if (nums[min] < target) {
                left = min;

            } else {
                right = min;
            }
        }
        return -1;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] a = {-1, -1};
        int[] b = new int[2];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                list.add(i);
            }
        }
        if (list.size() == 0) {
            return a;
        }
        b[0] = list.get(0);
        b[1] = list.get(list.size() - 1);
        return b;
    }
}















