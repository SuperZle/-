package KhFu;

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
 * 14:14
 * current system time
 * 2020
 * current year
 */


public class ServerDemo {

    public static void main(String[] args) throws IOException {
        //服务器
        ServerSocket serverSocket=new ServerSocket(9999);

        while (true) {
            //不关服务器
            Socket socket = serverSocket.accept();
            ThreadDemo t=new ThreadDemo(socket);
            //创建线程
            Thread thread=new Thread(t);
            System.out.println("连接上了"+thread.getName());
            thread.start();

        }

        //接收请求
//        InputStream inputStream = socket.getInputStream();
//        byte[] bytes=new byte[1024];
//        int i=0;
//        while ((i=inputStream.read(bytes))!=-1){
//            String s=new String(bytes,0,i);
//            System.out.println(s);
//            break;
//        }
//
//
//        //发送响应
//        OutputStream outputStream = socket.getOutputStream();
//        outputStream.write("劳资收到请求了，态度还是很诚恳嘛".getBytes());
//
//
//        //在最后一起关
//        outputStream.close();
//        inputStream.close();
//        socket.close();



    }
}
