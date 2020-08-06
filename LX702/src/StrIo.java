import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;

public class StrIo {
    public static void fun() throws IOException {
        Reader reader=new FileReader("D:\\code\\a\\b\\新建文本文档.txt");
        int read = reader.read();
        read=reader.read();
        System.out.print( (char)read);

        reader.close();

    }
    public static void fun1() throws IOException {
        Reader reader=new FileReader("D:\\code\\a\\b\\新建文本文档.txt");
        char[] chars=new char[2];
        int read=0;
        while ((read=reader.read(chars))!=-1){
            String string=new String(chars,0,read);
            System.err.print(string);
        }

        reader.close();

    }

    public static void main(String[] args) throws IOException {

        fun();
        fun1();
    }
}
