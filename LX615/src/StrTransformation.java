import java.text.SimpleDateFormat;
import java.util.Date;

public class StrTransformation {
    //String --->int
    public static int fun1(String s){
        int i = Integer.parseInt(s);
        Integer integer1 = Integer.valueOf(s);
        Integer integer = new Integer(s);
        return i;
    }
    //int  -->String
    public static String fun2(int i){
        String s =i+ "";
        String s1 = String.valueOf(i);
        String s2 = Integer.toString(i);
        return s;

    }
    //String --->char[]
    public static char[] fun3(String s){
        char[] chars = s.toCharArray();
        return chars;
    }
    //char[] --->String
    public static String fun4(char[] c){
        String s=new String(c);
        return s;
    }
    //String --->StringBuffer
    public static StringBuffer fun5(String s){
        StringBuffer sb=new StringBuffer(s);
        return sb;
    }
    //StringBuffer --->String
    public static String fun6(StringBuffer sb){
        String s = sb.toString();
        return s;
    }
    //String --->Date
//    public static Date fun7(String s){
//
//    }
//    //Date --->String
//    public static String fun8(Date date){
//        SimpleDateFormat sdf=new SimpleDateFormat();
//    }
}
