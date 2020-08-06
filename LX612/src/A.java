
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class A {

    public static void main(String[] args) throws ParseException {


        Scanner in = new Scanner(System.in);
        System.out.println("请输入年月日,格式：yyyy-MM-dd");
        String dateTime = in.nextLine();
        //String --> Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateTime);
        int dayOfWeek = getDayOfWeek(date);
        String[] days = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        System.out.println(days[dayOfWeek-1]);

    }

    public static int getDayOfWeek(Date date){
        //创建日历对象
        Calendar c = Calendar.getInstance();

        //设置年月日
        c.setTime(date);

        //从日历上获取这一天是这周的第几天
        int days = c.get(Calendar.DAY_OF_WEEK);
//        int days = c.get(Calendar.DAY_OF_YEAR);
        return days;
    }

    public static int getDayOfWeek(int year,int month,int day){
        //创建日历对象
        Calendar c = Calendar.getInstance();

        //设置年月日
        c.set(year,month-1,day);

        //从日历上获取这一天是这周的第几天
        int days = c.get(Calendar.DAY_OF_WEEK);
//        int days = c.get(Calendar.DAY_OF_YEAR);
        return days;
    }
}
