import java.io.*;

public class Zy1 {
    public static void main(String[] args) throws IOException{
//        funTxt();
//        funPng();
//        funPng1();
        File file=new File("D:\\新建文件夹 (2)\\新建文件夹 (2)");
        File file1=new File("D:\\新建文件夹 (2)\\新建文件夹");

        long l = System.currentTimeMillis();

        funCopy(file,file1,"88.jpg");
        long l1 = System.currentTimeMillis();
        System.err.println(l1-l);

    }
    public static void funTxt() throws IOException {
        File file=new File("D:\\新建文件夹 (2)\\新建文件夹 (2)\\Zy03.txt");
        InputStream inputStream=new FileInputStream(file);
        OutputStream outputStream=new FileOutputStream("D:\\新建文件夹 (2)\\新建文件夹\\a.txt");
        int i=0;
        while ((i=inputStream.read())!=-1){
            outputStream.write(i);
        }
        outputStream.flush();
        inputStream.close();
        outputStream.close();
    }


    public static void funPng() throws IOException {
        File file=new File("D:\\新建文件夹 (2)\\新建文件夹 (2)\\a.jpg");
        InputStream inputStream=new FileInputStream(file);
        OutputStream outputStream=new FileOutputStream("D:\\新建文件夹 (2)\\新建文件夹\\a1.jpg");
        int i=0;
        while ((i=inputStream.read())!=-1){
            outputStream.write(i);
        }
        outputStream.flush();
        inputStream.close();
        outputStream.close();

    }
    public static void funPng1() throws IOException {
        File file=new File("D:\\新建文件夹 (2)\\新建文件夹 (2)\\88.txt");
        Reader reader=new FileReader(file);
        Writer writer=new FileWriter("D:\\新建文件夹 (2)\\新建文件夹\\88.txt");
        int i=0;
        while ((i=reader.read())!=-1){
            writer.write(i);
        }
        writer.flush();
        writer.close();
        reader.close();

    }
    public static void funCopy(File file,File filee,String name) throws IOException {
        File[] files = file.listFiles();
        InputStream inputStream=null;
        OutputStream outputStream=null;
        for (File f:files
             ) {
            if (f.getName().contains(name)){
                File file1=new File(file+File.separator+name);
                File file2=new File(filee+File.separator+name);
                inputStream=new FileInputStream(file1);
                outputStream=new FileOutputStream(file2);
                byte[] bytes=new byte[1024];
                int i=0;
                while ((i=inputStream.read(bytes))!=-1){
                    outputStream.write(bytes,0,i);
                }
                outputStream.close();
                inputStream.close();
            }
        }
    }
}
