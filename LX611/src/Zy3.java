public class Zy3 {
    /**
     *
     * 统计以下字符串中的字母、数字、空格及其他字符的个数并输出。
     * String s = “hella hi32 @olq3 34% ^fun”;
     */
    public static void main(String[] args) {
        String s="hella hi32 @olq3 34% ^fun";
        System.out.println(s.length());

        String s1 = s.replaceAll(" ","");
        System.out.println("共有"+(s.length()-s1.length())+"个空格");

        String s2 = s1.replaceAll("\\d","");
        System.out.println("共有"+(s1.length()-s2.length())+"个数字");

        String s3 = s2.replaceAll("\\w", "");
        System.out.println("共有"+(s2.length()-s3.length())+"个字母");

        System.out.println("共有"+(s3.length())+"个其他字符");
    }
}
