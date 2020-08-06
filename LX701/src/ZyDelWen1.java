import java.io.File;

public class ZyDelWen1 {

    private static int i=0;

    public static void main(String[] args) {
        File file=new File("D:\\新建文件夹 - 副本");
        fun(file);
        System.out.println(i);
    }
    public static void fun(File file){

        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f:files
                 ) {
                fun(f);
                i++;
            }
        }
        file.delete();
    }
}
