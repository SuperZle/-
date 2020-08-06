public class GyStr {
    public static void main(String[] args) {
        String s="higgggggggdfddsd";//池中
        String s1=new String("HI");//new创建一个也有池中的
        char c=s.charAt(1);//索引0~
        System.out.println(c);
        boolean b=s.equals(s1);//内容是否相等，==是地址
        System.out.println(b);
        int i=s1.compareTo(s);
        System.out.println(i);
        char[] chars = s.toCharArray();
        System.out.println(chars);


    }
}
