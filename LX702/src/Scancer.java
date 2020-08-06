import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Scancer {
    public static void main(String[] args) throws IOException {
        //fun();
        //fun1();
//
        String s = fun2();
        System.out.println(s);


    }
    public static void fun() throws IOException {
        //标准输入流 为字节流
        InputStream in = System.in;
        //转化为字符流
        InputStreamReader inputStreamReader=new InputStreamReader(in);
        int read = inputStreamReader.read();
        System.out.println(read);
    }
    public static void fun1() throws IOException {
        System.out.println("请输入");
        //标准输入流 为字节流
        InputStream in = System.in;
        //转化为字符流
        InputStreamReader inputStreamReader=new InputStreamReader(in);
        char[] chars=new char[2];
        int read=0;
        while ((read=inputStreamReader.read(chars))!=-1){
            String s=new String(chars,0,read);
            System.out.println(s);
        }
    }
    public static String fun2() throws IOException {

        System.out.println("请输入");
        StringBuffer stringBuffer=new StringBuffer();
        //标准输入流 为字节流
        InputStream in = System.in;
        //转化为字符流
        InputStreamReader inputStreamReader=new InputStreamReader(in);

        char[] chars=new char[10];
        int read=0;
        while ((read=inputStreamReader.read(chars))!=-1){

            if (read<chars.length){
                stringBuffer.append(new String(chars, 0, read));
                break;
            }

            stringBuffer.append(new String(chars, 0, read));
        }

        inputStreamReader.close();
        return  stringBuffer.toString();
    }
}
