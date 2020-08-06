//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//
// 示例 1:
//
// 输入: 123
//输出: 321
//
//
// 示例 2:
//
// 输入: -123
//输出: -321
//
//
// 示例 3:
//
// 输入: 120
//输出: 21
//
//
// 注意:
//
// 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31, 2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
// Related Topics 数学


//leetcode submit region begin(Prohibit modification and deletion)




public class Z07整数反转 {
    public static void main(String[] args) {
        int i=468435445;
        int reverse = reverse(i);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        String s=x+"";

        StringBuffer sb=new StringBuffer(s);

        StringBuffer reverse = sb.reverse();

        String s1 = reverse.toString();

        char[] chars = s1.toCharArray();

        if (chars[0]==0 && chars[1]!=0){





        }

        int i = Integer.parseInt(s1);

        if (i>=-2147483648 && i<=2147483647){

            return i;

        }else {

            return 0;
        }

    }
}
