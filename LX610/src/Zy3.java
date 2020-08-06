public class Zy3 {
    /**
     * String s = “helloworld”;  进行倒序
     */
    public static void main(String[] args) {
        float f=1;
        long g=5;
        String s="helloworld";
        char[] c = s.toCharArray();
        for (int i = c.length-1; i >= 0 ; i--) {
            s=new String(String.valueOf(c[i]));
            System.out.print(s);
            Math.max(1,2);
        }
    }
}
