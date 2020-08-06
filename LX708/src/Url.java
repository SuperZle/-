import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Administrator
 * current user 张++
 * 2020/7/8 0008
 * current system date
 * 12:09
 * current system time
 * 2020
 * current year
 */

public class Url {
    public static void main(String[] args) throws IOException {
        URL url=new URL("https://www.taobao.com");

        URLConnection urlConnection = url.openConnection();
        //连接
        urlConnection.connect();
        InputStream inputStream = urlConnection.getInputStream();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\JAVA第一阶段\\网页\\网页.html"),"UTF-8"));
        String s=null;
        while ((s=bufferedReader.readLine())!=null){
            bufferedWriter.write(s);
            //System.out.println(s);
        }
        bufferedWriter.close();
        inputStream.close();
        //bufferedReader.close();
    }
}
