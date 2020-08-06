import java.util.Collection;
import java.util.concurrent.Callable;

/**
 * Administrator
 * current user 张++
 * 2020/7/6 0006
 * current system date
 * 17:15
 * current system time
 * 2020
 * current year
 */

//extends Thread   implements Runnable  implements Callable
public class XTest implements Callable {

    private int j;

    private int k;

    public XTest(int j, int k) {

        this.j = j;

        this.k = k;
    }

    @Override

    public Integer call() throws Exception {

        return j+k;

    }

}
