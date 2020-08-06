//编写一个算法来判断一个数 n 是不是快乐数。 
//
// 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，
// 也可能是 无限循环 但始终变不到 1。
//如果 可以变为 1，那么这个数就是快乐数。 
//
// 如果 n 是快乐数就返回 True ；不是，则返回 False 。 
//
// 
//
// 示例： 
//
// 输入：19
//输出：true
//解释：
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
// 
// Related Topics 哈希表 数学 
// 👍 383 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<Integer> list=new ArrayList<>();

    public boolean isHappy(int n) {
        if (n == 1 || n%10==0) {
            return true;
        }
        list.add(n);

        int i = 1;
        int a = 0;
        int b =0;

        int i1 = n;
        while (i1 / 10 > 0) {
            i1 /= 10;
            i++;
        }
        //看是几位数
        if (i == 1) {
            b=n*n;
            //两位数
        } else if (i == 2) {
            b=(int) ((Math.pow(n / 10, 2)) + ((Math.pow(n % 10, 2))));
            if (b%10==0){
                return true;
            }
            //三位及以上
        } else {
            for (int j = 2; j < i; j++) {
                a += (int) ((Math.pow(n / Math.pow(10, i - j) % 10, 2)));
            }
            b=(int) ((Math.pow(n / Math.pow(10, i - 1), 2)) + a + Math.pow(n % 10, 2));
            if (b%10==0){
                return true;
            }
        }
        for (int j = 0; j < list.size(); j++) {
            for (int k = j+1; k < list.size(); k++) {
                int aa=list.get(j);
                int bb=list.get(k);
                if (aa==bb){
                    return false;
                }
            }
        }
        return isHappy(b);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
