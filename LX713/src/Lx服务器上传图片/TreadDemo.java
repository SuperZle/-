package Lx服务器上传图片;

import java.io.*;
import java.net.Socket;

/**
 * current user 张++
 * 2020/7/13 0013
 * 15:48
 * 2020
 */


public class TreadDemo implements Runnable{

    private Socket socket;

    public TreadDemo(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void run() {

        InputStream inputStream =null;
        OutputStream outputStream=null;
        //读取客户端
        try {
            inputStream = socket.getInputStream();
            //写进服务器文件中
            outputStream=new FileOutputStream("D:\\新建文件夹"+File.separator+System.currentTimeMillis()+".png");
            byte[] bytes=new byte[1024];
            int i=0;
            while ((i=inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,i);
            }
            //提醒接收完毕
            socket.shutdownInput();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
           if (inputStream==null){
               try {
                   outputStream.close();
                   inputStream.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
        }
        //响应  写
        PrintWriter printWriter=null;
        try {
            printWriter=new PrintWriter(socket.getOutputStream());
            printWriter.println("图片上传成功");
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (printWriter==null){
                printWriter.close();
            }
        }

    }
}
