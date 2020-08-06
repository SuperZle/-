public class Z4 {
    /**
     * 给你1、2、3、4四个数字，将他们组成一个不重复的三位数输出到控制台
     *     如：
     *     合法：
     *         123、234
     *     不合法：
     *         112、233
     *      请使用方法的方式输出合法数字并计算出一共有多少种不同的组合方式
     * @param args
     */
    public static void main(String[] args) {
        //shuzhi();
        fun();
    }
    public static void fun(){
        int a=0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if (i!=j && i!=k && j!=k ){
                    a++;
                    System.out.println(100*i+10*j+k);
                    }
                }
            }
        }
        System.out.println(a);
    }
    public static void shuzhi(){
        //假设三位数为ijk，结果就是100*i+10*j+k
        int a=0;//为了求出所有符合的三位数之和
        int c=0;//为了计算有几个数符合
        for (int i=1; i<5 ; i++) {//每一次都从1开始赋值
            for (int j=1; j<5 ; j++) {//每一次都从1开始赋值
                for (int k=1; k<5 ; k++) {//每一次都从1开始赋值
                    if (i!=j){
                        if (i!=k){
                            if (j!=k){
                                int b=100*i+10*j+k;
                                System.out.println(b);
                                a+=b;
                                c++;
                            }
                        }
                    }
                }
            }
        }System.out.println(a);
        System.out.println(c);
    }
}
