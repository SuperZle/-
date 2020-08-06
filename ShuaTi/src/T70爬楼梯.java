import java.util.Random;

/**
 * current user 张++
 * 2020/7/23 0023
 * 8:32
 * 2020
 */
//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//
// 注意：给定 n 是一个正整数。
//
// 示例 1：
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶
//
// 示例 2：
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
//
// Related Topics 动态规划
// 👍 1149 👎 0


//leetcode submit region begin(Prohibit modification and deletion)



public class T70爬楼梯 {
    public static void main(String[] args) {
        int n=5;
        int m=0;
        double random = Math.random();
        int i=0;
        for (int j = 0; j < n; j++) {
            i+= (int) ((random+1)*1.4);

        }

        System.out.println(i);


    }
    public static int climbStairs(int n) {
        if (n==1){
            return 1;
        }
        if (n%2==0){
            return (int)Math.pow(2,(n/2));
        }
        return (int)Math.pow(2,((n-1)/2))+1;
    }
//    public static int fun() {
//
//    }
}
