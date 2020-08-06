package Computer;

public class Mouse implements Usb{
    //鼠标类  要符合USB接口

    @Override
    public void open() {
        System.out.println("开启鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }
}
