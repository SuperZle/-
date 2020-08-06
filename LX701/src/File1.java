import java.io.File;
import java.io.FileInputStream;

public class File1 {

    public static void main(String[] args) {
        File file = new File("D:\\新建文件夹 (2)");
        fun(file);
//        File[] files = file.listFiles();
//        for (int i = 0; i < files.length; i++) {
//            fun(files[i]);
//        }
    }

    public static void fun(File file) {
        File[] files = file.listFiles();
        if (files==null){
            return;
        }
        for (File f:files) {
//            if (f==null){
//                return;
            if (f.isFile()||f.isDirectory()){
                System.out.println(f);
                fun(f);
            }
        }
    }
}
