import javax.net.ssl.*;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Administrator
 * current user 张++
 * 2020/7/9 0009
 * current system date
 * 8:56
 * current system time
 * 2020
 * current year
 */


public class SSLServerSocketDemo {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, KeyManagementException {
        InetAddress localHost = InetAddress.getLocalHost();
        InetAddress byName = InetAddress.getByName("192.168.1.111");
        System.out.println(localHost);
        System.out.println(byName);
        Random random=new Random();
        System.out.println(random);


//        SSLContext instance = SSLContext.getInstance("192.168.1.187","ZLE");
//        KeyManager[] km=new KeyManager[5];
//        TrustManager[] tm=new TrustManager[8];
//        instance.init(km,tm,new SecureRandom());
//        //
//        //返回此上下文的 ServerSocketFactory对象。
//        SSLServerSocketFactory serverSocketFactory = instance.getServerSocketFactory();
//        ServerSocket serverSocket = serverSocketFactory.createServerSocket(8888,8,InetAddress.getLocalHost());
//        Socket accept = serverSocket.accept();


    }
}
