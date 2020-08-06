//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。 
//
// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。 
//
// 
//
// 示例: 
//
// 输入："23"
//输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
// 
//
// 说明: 
//尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。 
// Related Topics 字符串 回溯算法 
// 👍 777 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list1=new ArrayList<>();

        if (digits==""){
            return list1;
        }

        Map<Integer,String> map=new HashMap();

        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        //变成int
        Integer integer=new Integer(digits);
        int a=1;
        int b=integer;
        while (b/10>0){
            a++;
            b/=10;
        }

        if (a==1){
            char[] chars = map.get(integer).toCharArray();
            for (int i = 0; i < chars.length; i++) {
                list1.add(String.valueOf(chars[i]));
            }
            return list1;
        }

        if (a==2){
            List<String> list=new ArrayList<>();
            int i=integer/10;
            int i1=integer%10;
            String s = map.get(i);
            String s1 = map.get(i1);

            char[] chars = s.toCharArray();
            char[] chars1 = s1.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                for (int k = 0; k < chars1.length; k++) {
                    String s2 = String.valueOf(chars[j])+chars1[k];
                    list.add(s2);
                }
            }
            return list;
        }

        List<String> list=new ArrayList<>();

        StringBuffer sb=new StringBuffer();

        int i= (int) (integer/Math.pow(10,a-1));

        int i1=integer%10;

//        String s = map.get(i);
//        String s1 = map.get(i1);

        sb.append(map.get(i)).append(map.get(i1));

        for (int j = 2; j < a; j++) {
            int i2= (int) (integer/Math.pow(10,a-j)%10);
            sb.append(map.get(i2));
        }

        String s="";
        String string = sb.toString();
        char[] chars = string.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            for (int k = j+1; k < chars.length; k++) {
                s=String.valueOf(chars[j])+chars[k];
                list.add(s);
            }
        }

        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
