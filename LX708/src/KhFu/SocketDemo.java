package KhFu;

import java.io.*;
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
//        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//        bufferedWriter.write("上帝发送请求");
        PrintWriter printWriter=new PrintWriter(socket.getOutputStream());
        printWriter.println("上帝发送请求,还不快马加鞭响应");

        printWriter.flush();
        //socket.shutdownOutput();
        //接收请求
        //InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println("服务器看弹 ▄︻┻┳═一∵∴∷∶∵(∵_,∵)>>>>散弹发射！！"+s);



        bufferedReader.close();
        printWriter.close();
        socket.close();

    }
}
