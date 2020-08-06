import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Administrator
 * current user 张++
 * 2020/7/8 0008
 * current system date
 * 14:07
 * current system time
 * 2020
 * current year
 */

public class SocketDemo {
    public static void main(String[] args) throws IOException {
        //客户端
        Socket socket=new Socket("192.168.1.187",9999);

        //发送
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("上帝发送请求".getBytes());

        //socket.shutdownOutput();
        //接收请求
        InputStream inputStream = socket.getInputStream();
        byte[] bytes=new byte[1024];
        int i=0;
        while ((i=inputStream.read(bytes))!=-1){
            String s=new String(bytes,0,i);
            System.out.println(s);
            break;
        }
        inputStream.close();
        outputStream.close();
        socket.close();


    }
}
