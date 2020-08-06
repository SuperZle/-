package Lx服务器上传图片;


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
        Socket socket=new Socket("192.168.1.187",6666);
        //写给服务器  写图片 写
        OutputStream outputStream = socket.getOutputStream();
        // 从文件中读取 因为是图片所以用字节流
        InputStream inputStream=new FileInputStream("D:\\新建文件夹 (2)\\aa.png");

        byte[] bytes=new byte[1024];
        int i=0;
        while ((i=inputStream.read(bytes))!=-1){
            //写进服务器
            outputStream.write(bytes,0,i);
        }
        //提醒传输完毕  重要
        socket.shutdownOutput();

        //读取服务器
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println(s);

        bufferedReader.close();
//        inputStream.close();
    }
}
