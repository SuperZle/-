import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * Administrator
 * current user ++
 * 2020/7/10 0010
 * current system date
 * 11:05
 * current system time
 * 2020
 * current year
 */

@ZhuSi
public class ZhuSiTest {
    public static void main(String[] args) {
        Class zhuSiClass = ZhuSiTest.class;
        Annotation annotation = zhuSiClass.getAnnotation(ZhuSi.class);
        ZhuSi zhuSi=(ZhuSi) annotation;
        String name = zhuSi.name();
        int[] i = zhuSi.i();


        System.out.println(name);
        System.out.println(Arrays.toString(i));


    }
}
