public class MyTools {

    //求两个整数的和
    public static int and(int a, int b){
        return a+b;
    }

    //求某数的个阶乘
    public static int  factorial(int i){
        if (i==0){
            return 1;
        }return i*factorial(i-1);
    }
//    数组排序
    public static void sort(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length ; j++) {
                if (a[i]>a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
    }
    //判断一个数是否为素数
    public static boolean prime(int num){
        if (num==2 ||num==3){
            return true;
        }
        for (int i = 1; i < num ; i++) {
            if (num%i == 0){
                return false;
            }
        }
        return true;
    }

    //判断一个数是否为水仙花数
    public static boolean narcissistic(int num){
        int i=num/100;
        int j=num/10%10;
        int k=num%10;
        if (i*i*i+j*j*j+k*k*k==num){
            return true;
        }
        return false;
    }
    //两个数中较大的
    public static int max(int a,int b){
//        int max=(a>b?a:b);
//        return max;
        return a>b?a:b;
    }
    //判断某个数是否为完数
    //所有因子之和等于本身
    public static boolean perfect(int num){
        int k=0;
        for (int i = 1 ; i < num ; i++) {
            //求出所有的因子
            if (num%i == 0){
                //所有因子之和
                k+=i;
            }
        }
        if (num == k){
            //System.out.println(num);
            return true;
        }
        return false;
    }
}
