import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //String转化为date
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy,MM,dd");
        java.util.Date date=sdf.parse(s);

        System.out.println(week());
    }
    public static String week(){
        Calendar ca=Calendar.getInstance();
        ca.getTime();
        int time1= ca.get(Calendar.DAY_OF_WEEK);
        String[] s={"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return s[(time1-1)];
    }
}
