package Computer;

public class KeyBoard implements Usb{
    //键盘类    要符合USB接口
    @Override
    public void open() {
        System.out.println("开启键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

}
