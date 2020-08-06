import com.sun.org.apache.bcel.internal.generic.LXOR;

import java.io.File;
import java.io.FilenameFilter;

public class FileGuoLv {

    public static void fun(){
        File file=new File("E:\\JAVA第一阶段");
        File[] files = file.listFiles(new FileNameFile());
        for (File f:files
             ) {
            System.out.println(f);
        }

    }
    public static void fun1(){
        File file =new File("E:\\JAVA文件");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".flv")||name.endsWith(".tmp")){
                    return false;
                }
                return true;
            }
        });
        for (File f:files
             ) {
            System.out.println(f);
        }
    }
    public static void fun2(){
        File file=new File("E:\\JAVA");
        String[] list = file.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".iml")||name.endsWith(".docx")||name.endsWith(".java")||name.contains("LX")){

                    return false;
                }
                return true;
            }
        });

        for (String s:list
             ) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {

        //fun();
        //fun1();
        fun2();

    }
}
