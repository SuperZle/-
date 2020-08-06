/**
 * current user 张++
 * 2020/7/24 0024
 * 8:59
 * 2020
 */
//给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
//
// 示例 1:
//
// 输入: 1
//输出: true
//解释: 20 = 1
//
// 示例 2:
//
// 输入: 16
//输出: true
//解释: 24 = 16
//
// 示例 3:
//
// 输入: 218
//输出: false
// Related Topics 位运算 数学
// 👍 221 👎 0

//leetcode submit region end(Prohibit modification and deletion)


public class T2的幂 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }

    public static boolean isPowerOfTwo(int n) {

        while (n!=1){
            if (n%2==0){
                n/=2;
                continue;
            }
            return false;
        }
        return true;
    }
}
