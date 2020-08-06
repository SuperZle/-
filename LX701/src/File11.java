import java.io.File;

public class File11 {
    private static int i=0;
    public static void main(String[] args) {
        File file = new File("D:\\新建文件夹 (2)");
        fun(file);
        System.out.println(i);
    }

    public static void fun(File file) {

        File[] files = file.listFiles();
        if (files==null){
            return;
        }
        for (File f:files) {
//            if (f==null){
//                return;
            if (f.isFile() || f.isDirectory()){
               while (!f.delete()){
                   fun(f);
                   i++;
               }
            }
        }
    }
}
