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


import java.util.Arrays;

public class T6Z字形变换 {
    public static String convert(String s, int numRows) {
        if (s==""  ){
            return "";
        }
        if (numRows==1){
            return s;
        }

        char[] chars = s.toCharArray();
        //(1+n-2)(l/(2n-2))  列数
        int a=(numRows-1)*(chars.length/(2*numRows-2));

        if (chars.length%(numRows*2-2)==0){
            //列数就是a
            char[][] chars1=new char[numRows][a];
            int i=0;
            //二维数组列
            out:for (int j = 0; j < a; j++) {
                //二维数组行
                in:for (int k = 0; k < numRows; k++) {
                    if (j % (numRows-1) == 0){
                        chars1[k][j]=chars[i];
                        i++;
                        //避免超出索引长度
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


            //char转换成String
//            StringBuffer sb=null;
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
//            s1=sb.toString();
            return s1;

            //判断列数+1
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

//            StringBuffer sb=null;
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
//            s1= sb.toString();
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

//        StringBuffer sb=null;
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
//        s1= sb.toString();
        return s1;
    }

    public static void main(String[] args) {
        String s="ABCDE";
        String convert = convert(s, 4);
        System.out.println(convert);
        /*char[] chars = s.toCharArray();
        char[][] chars1=new char[3][5];
        //行3 列5
        //列
        int j=0;
        out:for (int i = 0; i < 5; i++) {
            for (int a = 0; a < 3; a++) {
                if (i%2 == 0 && j < chars.length){
                    chars1[a][i]=chars[j];
                    j++;
                    if (j==chars.length){
                        break out;
                    }
                }else {
                    chars1[1][i]=chars[j];
                        j++;
                    break;
                }
            }
        }
        //行
        String s1="";
        for (int i = 0; i < 3; i++) {
//            列
            for (int j1 = 0; j1 < 5; j1++) {
                if (chars1[i][j1]=='0'){
                    continue;
                }
                s1+=String.valueOf(chars1[i][j1]);
            }
        }
        PAHNAPLSIIGYIR"
        P A H NAPLSIIGY I R
        PAHNAPLSIIGY I R
        PAHNAPLSIIGY I R
        PAHNAPLSIIGYIR
        System.out.println(s1);*/
    }
}
