import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WenJian {
    public static void main(String[] args) throws IOException {

        fun();
        fun1();
    }
    public static void fun() throws IOException {


        Properties properties=new Properties();
        properties.setProperty("G","415");
        properties.setProperty("G1","4WGE5");
        properties.setProperty("G2","4S");
        properties.setProperty("G3","4TR5");
        FileOutputStream outputStream=new FileOutputStream("./LX703/src/bd.properties");
        properties.store(outputStream,"酸辣鱼啊好了");
        String g = properties.getProperty("G");
        System.out.println(g);


    }
    public static void fun1() throws IOException {

        Properties properties=new Properties();
        FileInputStream inputStream=new FileInputStream("./LX703/src/bd.properties");
        properties.load(inputStream);
        System.out.println(properties);
    }
}
