import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class IoLx {
    public static void fun() throws IOException {
        FileInputStream fileInputStream=new FileInputStream("D:\\code\\a\\b\\新建文本文档.txt");
        //int read = fileInputStream.read();
        int lea=0;
        while ((lea = fileInputStream.read())!=-1){
            System.out.println(lea);
        }
    }
    public static void fun1()throws IOException{
        FileInputStream fileInputStream=new FileInputStream("D:\\code\\a\\b\\新建文本文档.txt");

        byte[] b=new byte[3];
        int read = fileInputStream.read(b);
        int lea=0;
        System.out.println(Arrays.toString(b));
        fileInputStream.close();
    }
    public static void fun2()throws IOException{
        FileInputStream fileInputStream=new FileInputStream("D:\\code\\a\\b\\新建文本文档.txt");

        byte[] b=new byte[3];
        int lea=-1;
        while ((lea=fileInputStream.read(b))!=-1){
            String s=new String(b,0,lea);
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws IOException{
        //fun();
        fun2();
    }
}
