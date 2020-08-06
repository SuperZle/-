import java.io.*;

public class B {
    public static void main(String[] args) throws IOException {
        fun();
        BufferedReader buffered=new BufferedReader(new FileReader("D:\\新建文件夹 (2)\\新建文件夹\\0.txt"));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("D:\\新建文件夹 (2)\\新建文件夹 (2)\\00000000.txt"));
        String s;
        while (true){
            if ((s=buffered.readLine())!=null){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                //bufferedWriter.write(s);
                //System.out.println(s);
            }else {
                bufferedWriter.flush();
                bufferedWriter.close();
                buffered.close();
                return;
            }
        }

    }
    public static void fun()throws IOException{
        BufferedInputStream bIS=new BufferedInputStream(new FileInputStream("D:\\新建文件夹 (2)\\新建文件夹\\0.txt"));
        BufferedOutputStream bOS=new BufferedOutputStream(new FileOutputStream("D:\\新建文件夹 (2)\\新建文件夹 (2)\\0111000.txt"));
        int i;
        while ((i=bIS.read())!=-1){
            bOS.write(i);
            bOS.flush();
            bOS.close();
            bIS.close();
        }
    }
    public static void fun1()throws IOException{
        BufferedInputStream bIS=new BufferedInputStream(new FileInputStream("D:\\新建文件夹 (2)\\新建文件夹\\0.txt"));
        BufferedOutputStream bOS=new BufferedOutputStream(new FileOutputStream("D:\\新建文件夹 (2)\\新建文件夹 (2)\\0111000.txt"));
        byte[] bytes=new byte[1024];
        int i;
        while ((i=bIS.read(bytes))!=-1){
            bOS.write(bytes,0,i);
            bOS.flush();
            bOS.close();
            bIS.close();
        }
    }
    public static void fun2()throws IOException{
        BufferedReader buffered=new BufferedReader(new FileReader("D:\\新建文件夹 (2)\\新建文件夹\\0.txt"));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("D:\\新建文件夹 (2)\\新建文件夹 (2)\\00000000.txt"));
        String s;
//        String[] chars=new String[1024];
        while ((s=buffered.readLine())!=null){
            bufferedWriter.write(s);
            bufferedWriter.flush();
            bufferedWriter.close();
            buffered.close();
        }
    }
}
