import java.io.*;
import java.util.Scanner;

public class Buffed {
    public static void main(String[] args) {

        try {
            fun();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void scannerNext(){
        //从键盘读取
        Scanner sc= new Scanner(System.in);


        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    }
    public static void fun() throws FileNotFoundException {
        PrintStream ps=new PrintStream("D:\\新建文件夹 (2)\\新建文件夹 (2)\\4.txt");
        ps.println(121321);
        ps.println(245241);

        ps.println("FCGESXFRAxwwww");
        ps.println("雪儿说来了来了来了来了来了");
        ps.println("产生的V不要问V改为呃呃呃呃呃");
        PrintStream append = ps.append('5');
        System.out.println(append);
        PrintWriter pw=new PrintWriter("D:\\新建文件夹 (2)\\新建文件夹 (2)\\2.txt");
        PrintWriter pw1=new PrintWriter(new FileOutputStream("D:\\新建文件夹 (2)\\新建文件夹 (2)\\2.txt",true),true);

        pw.println("sadtgg");
        pw.println("sd是的支持法国设V个");
        pw1.println("是的刚测完吕不韦特");
        pw.flush();
        pw.close();

    }
}
