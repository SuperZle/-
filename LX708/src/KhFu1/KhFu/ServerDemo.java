package KhFu1.KhFu;

import java.io.IOException;
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
    }
}
