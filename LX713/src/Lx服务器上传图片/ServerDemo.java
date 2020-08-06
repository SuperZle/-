package Lx服务器上传图片;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * current user 张++
 * 2020/7/13 0013
 * 15:47
 * 2020
 */


public class ServerDemo {

    public static void main(String[] args) throws IOException {
        //创建服务器
        ServerSocket serverSocket=new ServerSocket(6666);
        while (true){
            //不关闭服务器
            Socket accept = serverSocket.accept();
            //创建线程的实现类
            TreadDemo treadDemo=new TreadDemo(accept);

            Thread thread=new Thread(treadDemo);

            System.out.println("连接上了"+ thread.getName());
            //开启线程
            thread.start();
        }
    }

}
