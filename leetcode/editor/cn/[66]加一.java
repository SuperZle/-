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
class Solution {
    public int[] plusOne(int[] digits) {
        if (digits.length==1){
            if (digits[0]==9){
                int[] ints={1,0};
                return ints;
            }
            digits[0]+=1;
            return digits;

        } else if (digits[digits.length-1]==9 && digits[digits.length-2]!=9){

            int[] ints=new int[digits.length];
            ints[ints.length-2]=digits[digits.length-2]+1;
            ints[ints.length-1]=0;
            for (int i = 0; i < ints.length-2; i++) {
                ints[i]=digits[i];
            }
            return ints;
        }else if (digits[0]==9 && digits[digits.length-1]==9) {
            for (int i = 0; i < digits.length; i++) {
                for (int j = i + 1; j < digits.length; j++) {
                    if (digits[i] == 9 ) {
                        if (digits[j]!=9){

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
        }else if (digits[0]!=9 && digits[digits.length-1]==9) {
            int a = 0;
            for (int i = 1; i < digits.length; i++) {
                for (int j = i + 1; j < digits.length; j++) {
                    if (digits[i] == 9) {
                        if (digits[j] != 9) {
                            break;
                        } else {
                            a = i;
                            int[] ints = new int[digits.length];
                            for (int j1 = 0; j1 < a - 1; j1++) {
                                ints[j1] = digits[j1];
                            }
                            ints[a - 1] = digits[a - 1] + 1;
                            for (int j2 = a; j2 < ints.length; j2++) {
                                ints[j2] = 0;
                            }
                            return ints;
                        }
                    }
                }
            }
        }else if (digits[digits.length-1]==9&&digits[digits.length-2]==9){
            int a=0;
            for (int i = digits.length-3; i > 0 ; i--) {
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
//leetcode submit region end(Prohibit modification and deletion)
