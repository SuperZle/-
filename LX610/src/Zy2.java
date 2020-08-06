public class Zy2 {
    /**
     * String s = “afkl3 4p35 afd2 3pe”; 统计字母、数字、空格的个数
     */
    public static void main(String[] args) {
        String s="afkl3 4p35 afd2 3pe";
        String s1 = s.replaceAll("\\D", "");
        System.out.println(s1.length());
        String s3 = s.replaceAll("[^a-z]", "");
        System.out.println(s3.length());
        System.out.println(s.length()-s1.length()-s3.length());
        /*char[] c=s.toCharArray();
        int i1=0;
        int j=0;
        int z=0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' '){
                i1++;
            }else if (c[i]>='0' && c[i]<='9'){
                j++;
            }else if (c[i]>='A' && c[i]<='Z' || c[i]>='a' && c[i]<='z'){
                z++;
            }else {
            }
        }System.out.println("共有"+i1+"个空格");
        System.out.println("共有"+j+"个数字");
        System.out.println("共有"+z+"个字母");*/
    }
}
