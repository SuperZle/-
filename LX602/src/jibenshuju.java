public class jibenshuju {
    public static void main(String[] args){
        //byte 取值：-2^7~2^7-1                            初始值；0 输出值：0                1个字节
        byte b=5;
        System.out.println(b);
        //short 取值：-2^15~2^15-1                         初始值；0 输出值：0                 2个字节
        short s=5;
        //int 取值：-2^31~2^31-1                           初始值；0 输出值；0                 4个字节
        int i=6;
        //long 取值：-2^63~2^63-1                          初始值；0 输出值：0                 8个字节
        long l=55;
        //float 取值：2^-149~（2-2^-23）*2^127              初始值；0 输出值；0.0               4个字节
        float f=55;
        //double 取值：2^-1074~（2-2^-52）*2^1023           初始值；0 输出值；0.0               8个字节
        double d=6665;
        //char 取值：‘\uFFFF’~'\u0000' 0-65535                    初始值；0 输出值：空          2个字节
        char c=545;
        //boolean 取值；true/false                         初始值；false 输出值：false          1个字节
        boolean b1=true;
        double pow = Math.pow(2, 127);
        System.out.println(pow);
        char c1='\u0000';
        System.out.println(c1+1);


    }
}

