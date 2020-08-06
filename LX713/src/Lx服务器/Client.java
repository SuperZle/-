package Lx服务器;


import java.io.*;
import java.net.Socket;

/**
 * current user 张++
 * 2020/7/13 0013
 * 15:47
 * 2020
 */


public class Client {

    public static void main(String[] args) throws IOException {
        //创建客户端
        Socket socket=new Socket("192.168.1.187",8888);

        //写给服务器
        OutputStream outputStream = socket.getOutputStream();
        PrintWriter printWriter=new PrintWriter(outputStream);
        printWriter.println("上帝上线了");
        //刷新
        printWriter.flush();

        //读取服务器
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println(s);


        bufferedReader.close();
        printWriter.close();
        outputStream.close();

    }
}
