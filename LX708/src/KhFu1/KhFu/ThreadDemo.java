package KhFu1.KhFu;

import javax.print.attribute.standard.NumberUp;
import java.io.*;
import java.net.Socket;
import java.util.Random;

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

        InputStream inputStream=null;
        File file=null;
        OutputStream outputStream=null;
        PrintWriter printWriter=null;

        Random random=new Random();
        int i1=random.nextInt(100);

        //服务器开始接收上传的图片  读取  只能字节读
        try {
            //写入服务器文件夹中
            file=new File("E:\\JAVA第一阶段\\upload99"+File.separator+System.currentTimeMillis()+i1+".jpg");
            outputStream=new FileOutputStream(file);
            //因为在try catch 中 分开写
            inputStream = socket.getInputStream();
            byte[] bytes=new byte[1024];
            int i=0;
            while ((i=inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,i);
            }
            //提醒读完成
            socket.shutdownInput();

            //提现客户端  写入给客户端  用高速写
            printWriter=new PrintWriter(socket.getOutputStream());
            printWriter.println("上传成功");
            printWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭
            try {
                if (printWriter!=null)
                    printWriter.close();
                if (outputStream!=null)
                    outputStream.close();
                if (inputStream!=null)
                    inputStream.close();
            }catch (Exception e){

            }
        }

    }
}
