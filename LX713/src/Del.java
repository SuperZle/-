import java.io.File;

/**
 * current user 张++
 * 2020/7/13 0013
 * 18:18
 * 2020
 */


public class Del {
    public static void main(String[] args) {
        File file=new File("D:\\新建文件夹 - 副本");
        fun(file);
    }
    public static void fun(File file){

//        File[] files = file.listFiles();
//        for (int i = 0; i < files.length; i++) {
//            if (files[i].isDirectory()){
//                fun(files[i]);
//            }
//            files[i].delete();
//            i1++;
//        }
//        file.delete();
//        System.out.println(i1);
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f:files
                 ) {
                fun(f);
            }
        }
        file.delete();
    }
}
