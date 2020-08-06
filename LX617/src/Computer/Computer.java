package Computer;

/**
 * 笔记本类，包含运行功能、关机功能
 * 笔记本具备使用USB设备的功能
 * 实现笔记本使用USB鼠标、USB键盘
 */
public class Computer implements Usb{
    public void open(){
        System.out.println("笔记本开机");;
    }
    public void close(){
        System.out.println("笔记本关机");;
    }
    public void use(Usb usb){
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.open();
            mouse.close();
        }else if (usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard)usb;
            keyBoard.open();
            keyBoard.close();
        }
    }
}
