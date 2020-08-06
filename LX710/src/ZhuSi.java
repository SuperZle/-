import java.lang.annotation.*;

/**
 * Administrator
 * current user 张++
 * 2020/7/10 0010
 * current system date
 * 10:58
 * current system time
 * 2020
 * current year
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)//必须de
@Documented
@Inherited//继承
public @interface ZhuSi {
    String name() default "小米";
    int[] i() default {2,5,0};
}
