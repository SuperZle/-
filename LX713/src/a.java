import java.io.File;

/**
 * current user 张++
 * 2020/7/13 0013
 * 18:01
 * 2020
 */


public class a {
    public static void main(String[] args) {
//        File file=new File("D:"+File.separator+"新建文件夹 (2)");
//        fun(file);
        for (double i = 0.1; i <= 360.1; i+=0.1) {
            System.out.println(i*5/18+"%{transform: rotateZ("+i+"deg);}");

        }
    }
    public static void fun(File file){
        File[] files = file.listFiles();
//        for (int i = 0; i < files.length; i++) {
//            if (files[i].isDirectory()){
//                fun(files[i]);
//            }
//            System.out.println(files[i]);
//        }
        for (File f:files
             ) {
            if (f.isDirectory()){
                fun(f);
            }
            System.out.println(f);
        }
    }
}
