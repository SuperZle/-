package KhFu1.KhFu;

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

        //本地读出图片
        File file=new File("D:\\新建文件夹 (2)\\新建文件夹 (2)\\a.jpg");
        InputStream inputStream=new FileInputStream(file);
        byte[] bytes=new byte[1024];
        int i=0;
        //上传图片  写进服务器
        OutputStream outputStream = socket.getOutputStream();
//        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(socket.getOutputStream());
        while ((i=inputStream.read(bytes))!=-1){
            //写进服务器
            outputStream.write(bytes,0,i);
            //bufferedOutputStream.write(bytes,0,i);
        }
        //传完后提醒服务器
        socket.shutdownOutput();

        //接受服务器的响应   读取
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = bufferedReader.readLine();
        System.out.println("服务器已经接收到"+s);

        //关闭
        bufferedReader.close();
        inputStream.close();

    }
}
