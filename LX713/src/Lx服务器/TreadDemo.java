package Lx服务器;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * current user 张++
 * 2020/7/13 0013
 * 15:48
 * 2020
 */


public class TreadDemo implements Runnable{
// 绑定服务器
    private Socket socket;
//构造
    public TreadDemo(Socket socket) {
        this.socket=socket;
    }
//重写run方法
    @Override
    public void run() {
        BufferedReader bufferedReader=null;
        String s =null;
        //读取客户端
        try {
            bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            s = bufferedReader.readLine();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (s==null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //响应  写
        PrintWriter printWriter=null;
        try {
            printWriter=new PrintWriter(socket.getOutputStream());
            printWriter.println("服务器已经接受到了");
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
