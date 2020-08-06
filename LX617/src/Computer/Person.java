package Computer;

/**
 * 人使用电脑
 */
public class Person {
    public static void main(String[] args) {
        //创建键盘
        KeyBoard key = new KeyBoard();
        //创建鼠标
        Mouse m = new Mouse();
        //创建电脑
        Computer com = new Computer();
        com.open();
        com.use(m);
        com.use(key);
        com.close();

    }
}
