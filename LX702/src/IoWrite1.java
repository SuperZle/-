import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IoWrite1 {
    public static void main(String[] args) {
        fun();
    }
    public static void fun(){
        Writer writer=null;
        File file=new File("./\\LX702\\Zy03.txt");
        try {
            writer=new FileWriter(file);
            writer.write(555);
            char[] chars= {'上','元','牛','批'};
            writer.write(chars);
            writer.write("中国");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
