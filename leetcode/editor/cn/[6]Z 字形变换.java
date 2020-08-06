//将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。 
//
// 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下： 
//
// L   C   I   R
//E T O E S I I G
//E   D   H   N
// 
//
// 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。 
//
// 请你实现这个将字符串进行指定行数变换的函数： 
//
// string convert(string s, int numRows); 
//
// 示例 1: 
//
// 输入: s = "LEETCODEISHIRING", numRows = 3
//输出: "LCIRETOESIIGEDHN"
// 
//
// 示例 2: 
//
// 输入: s = "LEETCODEISHIRING", numRows = 4
//输出: "LDREOEIIECIHNTSG"
//解释:
//
//L     D     R
//E   O E   I I
//E C   I H   N
//T     S     G 
// Related Topics 字符串


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convert(String s, int numRows) {

        if (s==""){
            return null;
        }

        if (numRows==1){
            return s;
        }

        char[] chars = s.toCharArray();
        //(1+n-2)(l/(2n-2))
        int a=(numRows-1)*(chars.length/(2*numRows-2));

        if (chars.length%(numRows*2-2)==0){
            char[][] chars1=new char[numRows][a];

            int i=0;
            //二维数组列
            out:for (int j = 0; j < a; j++) {
                //二维数组行
                in:for (int k = 0; k < numRows; k++) {
                    if (j % (numRows-1) == 0){
                        chars1[k][j]=chars[i];
                        i++;
                        if (i==chars.length){
                            break out;
                        }
                    }else {
                        //行递减
                        for (int l = numRows-2; l > 0; l--,j++) {
                            chars1[l][j]=chars[i];
                            i++;
                            if (l==1){
                                break in;
                            }
                        }
                        if (i==chars.length){
                            break out;
                        }
                    }
                }
            }
            String s1="";
            //行
            for (int i1 = 0; i1 < numRows; i1++) {
//            列
                for (int j1 = 0; j1 < a; j1++) {
                    if (chars1[i1][j1]=='\u0000'){
                        continue;
                    }
                    s1+=chars1[i1][j1];
                }
            }
            return s1;

        }else if (chars.length%(numRows*2-2)<=numRows){
            int l=a+1;
            char[][] chars1=new char[numRows][l];
            int i=0;
            //二维数组列
            out:for (int j = 0; j < l; j++) {
                //二维数组行
                in:for (int k = 0; k < numRows; k++) {
                    if (j % (numRows-1) == 0){
                        chars1[k][j]=chars[i];
                        i++;
                        if (i==chars.length){
                            break out;
                        }
                    }else {
                        //行递减
                        for (int l1 = numRows-2; l1 > 0; l1--,j++) {
                            chars1[l1][j]=chars[i];
                            i++;
                            if (l1==1){
                                break in;
                            }
                        }
                        if (i==chars.length){
                            break out;
                        }
                    }
                }
            }
            String s1="";
            //行
            for (int i1 = 0; i1 < numRows; i1++) {
//            列
                for (int j1 = 0; j1 < l; j1++) {
                    if (chars1[i1][j1]=='\u0000'){
                        continue;
                    }
                    s1+=chars1[i1][j1];
                }
            }
            return s1;
        }

        //列数
        int l=a+1+(chars.length%(2*numRows-2)-numRows);

        char[][] chars1=new char[numRows][l];
        int i=0;
        //二维数组列
        out:for (int j = 0; j < l; j++) {
            //二维数组行
            in:for (int k = 0; k < numRows; k++) {
                if (j % (numRows-1) == 0){
                    chars1[k][j]=chars[i];
                    i++;
                    if (i==chars.length){
                        break out;
                    }
                }else {
                    //行递减
                    for (int l1 = numRows-2; l1 > 0; l1--,j++) {
                        chars1[l1][j]=chars[i];
                        i++;
                        if (l1==1){
                            break in;
                        }
                    }
                    if (i==chars.length){
                        break out;
                    }
                }
            }
        }
        String s1="";
        //行
        for (int i1 = 0; i1 < numRows; i1++) {
//            列
            for (int j1 = 0; j1 < l; j1++) {
                if (chars1[i1][j1]=='\u0000'){
                    continue;
                }
                s1+=chars1[i1][j1];
            }
        }
        return s1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
