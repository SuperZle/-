import java.io.*;

public class YcBuHuo {
    public static void main(String[] args) {

        fun();
    }
    public static void fun(){
        File file =new File("./LX702\\Zy03.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);

        Reader reader=null;
        try {
            reader=new FileReader(file);
            char[] chars=new char[1024];
            int read=0;
            while ((read=reader.read(chars))!=-1){
                String string=new String(chars,0,read);
                System.out.println(string);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
