public class Zy1 {
    /**
     *
     * 把下列字符串中所有的一个或者多个数字都替换成一个e，并且全转换成小写字母输出。
     * h5LLo, Us9d TO B10gin A T20l76pHOn8 COnv5rsATION
     *
     */
    public static void main(String[] args) {
        String s="h5LLo, Us9d TO B10gin A T20l76pHOn8 COnv5rsATION";
        String e = s.replaceAll("\\d", "e");
        System.out.println(e.toLowerCase());
//        char[] chars = e.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            System.out.print(Character.toLowerCase(chars[i]));
//        }
    }
}
