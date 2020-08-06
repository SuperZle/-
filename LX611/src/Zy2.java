public class Zy2 {
    /**
     *把以下字符串中的小写字母变成大写字母，大写字母变成小写字母。
     * String s = “heLLoWorD”;
     *
     */
    public static void main(String[] args) {
        String s="heLLoWorD";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])){
                chars[i]=Character.toLowerCase(chars[i]);
            }else if (Character.isLowerCase(chars[i])){
                chars[i]=Character.toUpperCase(chars[i]);
            }
        }
        System.out.println(chars);
    }
}
