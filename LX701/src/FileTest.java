import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void fun() throws IOException {

        File file=new File("D:\\code\\a\\b\\c.txt");
        //file.mkdirs();
        boolean exists = file.exists();
        if (exists){
            file.delete();
            file.createNewFile();
        }else{
            File parentFile = file.getParentFile();
            parentFile.mkdirs();
            parentFile.createNewFile();
        }

        System.out.println(file);
        System.out.println(exists);
//        System.out.println(exists);
//        boolean mkdirs = file.mkdirs();
//        System.out.println(mkdirs);
//        file.mkdir();
//        File parentFile = file.getParentFile();
//        System.out.println(parentFile);
//
//        boolean mkdirs1 = parentFile.mkdirs();
//        System.out.println(mkdirs1);
//        File file1=new File(file,"c.txt");
//        boolean mkdirs2 = file1.mkdirs();

    }

    public static void main(String[] args) throws IOException{

        fun();
    }
}
