import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void fun() throws IOException {

        File file=new File("D:\\I18N\\2052");
        System.out.println(file);

        File file1=new File(file,"a.txt");
        System.out.println(file1);

        boolean mkdirs = file1.mkdirs();
        file1.delete();
        boolean newFile = file1.createNewFile();

    }

    public static void main(String[] args) throws IOException{

        fun();

    }
}
