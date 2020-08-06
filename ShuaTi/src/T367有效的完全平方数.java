/**
 * current user 张++
 * 2020/8/1 0001
 * 8:39
 * 2020
 */

//给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
//
// 说明：不要使用任何内置的库函数，如 sqrt。
//
// 示例 1：
//
// 输入：16
//输出：True
//
// 示例 2：
//
// 输入：14
//输出：False
//
// Related Topics 数学 二分查找
// 👍 151 👎 0


//leetcode submit region begin(Prohibit modification and deletion)


public class T367有效的完全平方数 {
    public static void main(String[] args) {
        long b1=System.currentTimeMillis();
//        System.out.println(Math.ceil(46.5));
        int center= (int) Math.ceil((double) (46.5));

        System.out.println(center);
//        System.out.println(isPerfectSquare(2147));
        long b2=System.currentTimeMillis();
        double t1=(double) (b2-b1)/1000;
        System.out.println("用时"+t1+"s");

    }
    public static boolean isPerfectSquare(int num) {
        if (num==1 || num==4){
            return true;
        }
        int first=0;
        int last=num;
        while (first<last){
            int center= (int) Math.ceil((double) (first+last)/2);
            if(center*center==num){
                return true;
            }else if (center*center<num){
                first=center;
            }else {
                last=center;
            }
        }


//        int n=0                );
//        for (int i = 2; i < num; i++) {
//            n++;
//            if (num%i==0){
//                if (i*i==num){
//                    return true;
//                }
//            }else if (i*i>num){
//                return false;
//            }
//        }
//        System.out.println(n+"   --------------------");
        return false;
    }
}
