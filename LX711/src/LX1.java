import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Administrator
 * current user 张++
 * 2020/7/11 0011
 * current system date
 * 9:38
 * current system time
 * 2020
 * current year
 * static Calendar
 * get Instance()
 * 使用默认时区和区域设置获取日历。
 * 键盘输入年月日，输出这一天是星期几？这一天是这一年的第多少天？
 */


public class LX1 {
    public static void main(String[] args) throws ParseException {
        System.out.println(1>5?1.0:2);

        List list=new ArrayList<String>();
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy,MM,dd");
        //String 转化为Date
        Date parse = sdf.parse(s);
        //创建日历对象
        Calendar calendar=new GregorianCalendar();
        Calendar instance = Calendar.getInstance();


        //设置年月日
        calendar.setTime(parse);
        //字段编号为 get和 set表示星期几
        int dayOfWeek = Calendar.DAY_OF_WEEK;
        //星期几
        int i = calendar.get(dayOfWeek);

        String[] strings={"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
//        int dayOfWeek = Calendar.DAY_OF_WEEK;
        System.out.println(strings[i-1]);

        //get和 set字段编号表示当年的日期编号
        int dayOfYear = Calendar.DAY_OF_YEAR;
        int i1 = calendar.get(dayOfYear);
        System.out.println(parse+"是"+i1);





    }
}
