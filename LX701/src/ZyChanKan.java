import java.io.File;

public class ZyChanKan {
    public static void main(String[] args) {
        File file=new File("D:\\新建文件夹");
       fun(file);

    }
    private static void fun(File file){
        File[] files = file.listFiles();
        if (files==null){
            return ;
        }
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()||files[i].isFile()){
                System.out.println(files[i]);
                fun(files[i]);
            }
        }
    }
}
