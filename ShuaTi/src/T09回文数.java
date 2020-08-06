//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
// 示例 1:
//
// 输入: 121
//输出: true
//
//
// 示例 2:
//
// 输入: -121
//输出: false
//解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//
//
// 示例 3:
//
// 输入: 10
//输出: false
//解释: 从右向左读, 为 01 。因此它不是一个回文数。
//
//
// 进阶:
//
// 你能不将整数转为字符串来解决这个问题吗？
// Related Topics 数学


//leetcode submit region end(Prohibit modification and deletion)

public class T09回文数 {

    public static boolean isPalindrome(int x) {

        long l=x;

        String s=x+"";

        char[] chars = s.toCharArray();

        if (chars[0] == '-' || chars[0] == '+'){

            return false;

        }else {
            String s1=new String(chars);

            StringBuffer sb = new StringBuffer(s1);

            String s2 = sb.reverse().toString();

            Long l1=new Long(s2);

            if (l1 == l) {

                return true;

            }else {

                return false;
            }
        }
    }

    public static void main(String[] args) {

        int i=0;

        boolean palindrome = isPalindrome(i);

        System.out.println(palindrome);

    }
}
