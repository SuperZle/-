import java.io.*;

public class A {
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\新建文件夹 (2)\\新建文件夹 (2)");
        File file1=new File("D:\\新建文件夹 (2)\\新建文件夹");

        funCopy(file,file1,".txt");

        long l = System.currentTimeMillis();

        funCopy(file,file1,".txt");
        long l1 = System.currentTimeMillis();
        System.err.println(l1-l);
        //funPng1();
    }
    public static void funCopy(File file,File filee,String name) throws IOException {
        File[] files = file.listFiles();
        InputStream inputStream=null;
        OutputStream outputStream=null;

        for (int j = 0; j < 10; j++) {
            for (File f:files
            ) {
                if (f.getName().contains(name)){
                    File file1=new File(file+File.separator+j+name);
                    File file2=new File(filee+File.separator+j+name);
                    inputStream=new FileInputStream(file1);
                    outputStream=new FileOutputStream(file2);
                    int i=0;
                    while ((i=inputStream.read())!=-1){
                        outputStream.write(i);
                    }
                    outputStream.flush();
                    inputStream.close();
                    outputStream.close();
                }
            }
        }
    }
    public static void funPng1() throws IOException {
        File file=new File("D:\\新建文件夹 (2)\\新建文件夹 (2)\\88.txt");
        Reader reader=new FileReader(file);
        //Writer writer=new FileWriter("D:\\新建文件夹 (2)\\新建文件夹\\88.txt");

        int i=0;


        //System.out.println((char) i);
        while ((i=reader.read())!=-1){
            System.out.println((char) i);
        }
//        writer.flush();
//        writer.close();
        reader.close();

    }

}
