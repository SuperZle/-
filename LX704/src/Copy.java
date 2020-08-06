import org.omg.CORBA.portable.InputStream;

import java.io.*;

//写一个java程序实现文件的copy
public class Copy {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\windows\\新建文件夹 (2)");
        File file1=new File("D:\\windows\\新建文件夹");
        copy(file,file1,"10.txt");

    }
    public static void copy(File file,File file1,String name) throws IOException {

        File[] files = file.listFiles();
        for (File f:files
             ) {
            if (f.getName().contains(name)){
                FileInputStream inputStream=new FileInputStream(file+File.separator+name);
                FileOutputStream outputStream=new FileOutputStream(file1+File.separator+name);
                int i=0;
                while ((i=inputStream.read())!=-1){
                    outputStream.write(i);
                }
            }
        }



    }
}
