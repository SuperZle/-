//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。
//
// 示例 1:
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
//
//
// 示例 2:
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
//
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)

import java.math.BigInteger;
import java.util.Arrays;




//        int[] ints = plusOne(i);
//        System.out.println(Arrays.toString(ints));
        /*double d=0;
        for (int i = 0 ,j=digits.length-1; i < digits.length; i++,j--) {
            d+=digits[i]*Math.pow(10,j);
        }

        double b=d+1;
        double c=d+1;
        int a=1;
        for (int i = 0; i < digits.length+1; i++) {
            if (b/10>=1){
                b=b/10;
                a++;
            }else {break;}
        }

        System.out.println(a);
        int[] ints=new int[a];
        ints[0]=(int)(c/Math.pow(10,a-1));
        //ints[ints.length-1]=(int) c%10;
        for (int i = 1; i < ints.length; i++) {
            ints[i]=(int)(c/Math.pow(10,ints.length-i-1)%10);
        }
        System.out.println(Arrays.toString(ints));*/
public class T66加一 {
    public static void main(String[] args) {
        int[] digits={9,9,5,9};
        int[] ints = plusOne2(digits);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] plusOne2(int[] digits) {
        //个位数时
        if (digits.length==1){
            if (digits[0]==9){
                int[] ints={1,0};
                return ints;
            }
            digits[0]+=1;
            return digits;
            //全是9
        }else if (digits[0]==9 && digits[digits.length-1]==9) {
            out:for (int i = 1; i < digits.length; i++) {
                if (digits[i] != 9 ) {
                    break out;
                }
                for (int j = i + 1; j < digits.length; j++) {
                        if (digits[j]!=9){
                            break out;
                        }else {
                            int[] ints = new int[digits.length + 1];
                            ints[0] = 1;
                            for (int j1 = 1; j1 < ints.length; j1++) {
                                ints[j1] = 0;
                            }
                            return ints;
                        }
                    }
                }

        }
        if (digits[digits.length-1]==9){
            int a=0;
            for (int i = digits.length-2; i > 0 ; i--) {
                if (digits[i]!=9){
                    a=i;
                    int[] ints=new int[digits.length];
                    for (int j = 0; j < a; j++) {
                        ints[j]=digits[j];
                    }
                    ints[a]=digits[a]+1;
                    for (int j = a+1; j < ints.length; j++) {
                        ints[j]=0;
                    }
                    return ints;
                }
            }
        }
        int[] ints1 = Arrays.copyOf(digits, digits.length);

        ints1[ints1.length-1]=digits[digits.length-1]+1;

        return  ints1;

    }
}
