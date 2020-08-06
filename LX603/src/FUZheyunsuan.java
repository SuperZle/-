public class FUZheyunsuan {
    public static void main(String[] args) {
        //强制类型转换将int类型强转为byte类型，byte占一个字节及8个bit
        //300转化二进制为100101100，byte只能接收8个为00101100.转化成十进制为44.
        byte b=(byte)300;
        System.out.println(b);
//        字符串用string
        int a=18;
        int c=15;
        String str=(a>c? "我大我请吃冰淇淋":"我小我没钱");
        System.out.println(str);
    }
}
