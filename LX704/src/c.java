import java.io.File;

/**
 *  获取d:/windows目录及所有子目录下所有的.txt文件名称
 */
public class c {

    public static void main(String[] args) {
        File file=new File("d:\\windows")  ;
        fun(file);



    }

    public static void fun(File file){
        File[] files = file.listFiles();
        for (File f:files
        ) {
            if (f.isDirectory()){
                fun(f);
            }
            if (f.getName().endsWith(".txt")){
                System.out.println(f);
            }
        }
    }
}
