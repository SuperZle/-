package KhFu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.Buffer;

/**
 * Administrator
 * current user 张++
 * 2020/7/8 0008
 * current system date
 * 15:51
 * current system time
 * 2020
 * current year
 */


public class ThreadDemo implements Runnable{

    private Socket socket;

    public ThreadDemo(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void run() {

        BufferedReader bufferedReader=null;
        String s=null;

        //读取请求
        try {
            bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            s = bufferedReader.readLine();
            System.out.println("服务器已经接受,上帝稍等"+s+Thread.currentThread().getName());
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

        PrintWriter printWriter=null;
        //响应
        try {
            printWriter=new PrintWriter(socket.getOutputStream());
            printWriter.println("上帝看弹▄︻┻┳═一∵∴∷∶∵(∵_,∵)>>>>散弹发射！！"+Thread.currentThread().getName());
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
