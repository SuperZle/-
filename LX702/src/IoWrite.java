import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IoWrite {
    public static void main(String[] args) throws IOException {

        fun();

    }
    public static void fun() throws IOException {
        OutputStream outputStream=new FileOutputStream("D:\\code\\a\\b\\新建文本文档.txt");
        byte[] bytes={'s','d'};
        outputStream.write(bytes);
        outputStream.write("中国".getBytes());
    }
}
