/**
 * current user 张++
 * 2020/7/24 0024
 * 8:30
 * 2020
 */

//编写一个程序判断给定的数是否为丑数。
//
// 丑数就是只包含质因数 2, 3, 5 的正整数。
//
// 示例 1:
//
// 输入: 6
//输出: true
//解释: 6 = 2 × 3
//
// 示例 2:
//
// 输入: 8
//输出: true
//解释: 8 = 2 × 2 × 2
//
//
// 示例 3:
//
// 输入: 14
//输出: false
//解释: 14 不是丑数，因为它包含了另外一个质因数 7。
//
// 说明：
//
//
// 1 是丑数。
// 输入不会超过 32 位有符号整数的范围: [−231, 231 − 1]。
//
// Related Topics 数学
// 👍 137 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

public class T263丑数 {
    public static void main(String[] args) {
        System.out.println(isUgly(3));

    }

    public static boolean isUgly(int num) {
        if(num==1){
            return true;
        }
        if (num==0){
            return false;
        }
        while (num != 1){
            if (num%2==0){
                num/=2;
                continue;
            }
            if (num%3==0){
                num/=3;
                continue;
            }
            if (num%5==0){
                num/=5;
                continue;
            }
            return false;
        }
        return true;
//        if(num==1 || num==2 || num==3 || num==5){
//            return true;
//        }
//        if (num%2 != 0 && num%3 != 0 && num%5 != 0){
//            return false;
//        }
//        boolean b=true;
//        int a=0;
//        for (int i = 2; i <= num/2; i++) {
//            if (num%i==0){
//                a++;
//                if (i%2 != 0 && i%3 != 0 && i%5 != 0){
//                    b=false;
//                    break;
//                }
//            }
//        }
//        if (a==0){
//            return false;
//        }
//        return b;
    }
}
