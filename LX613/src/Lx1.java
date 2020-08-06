public class Lx1 {
    public static void main(String[] args) {
        String s="12,45,36,2,5,";
        //转换为StringBuffer
        StringBuffer sb=new StringBuffer(s);
        String s1 = sb.toString();
        char[] C={'a','5'};
        String s2=new String(C);
        System.out.println(s2);
    }
}
