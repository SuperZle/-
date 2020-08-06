import org.omg.CORBA.portable.OutputStream;

import java.io.*;

public class XuLie {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //funWrite();
        funRead();

    }
    public static void funRead() throws IOException, ClassNotFoundException {
        //Animal animal=new Animal("旺财","黑色",2,"G");

        InputStream inputStream=new FileInputStream("D:\\新建文件夹 (2)\\新建文件夹 (2)\\animalDog.txt");

        ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
        Object o = (Animal)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(o);


        //objectInputStream.readObject(animal)

    }
    public static void funWrite() throws IOException {
        Animal animal=new Animal("旺财","黑色",2,"G");
        FileOutputStream outputStream= new FileOutputStream("D:\\新建文件夹 (2)\\新建文件夹 (2)\\animalDog.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(animal);
        objectOutputStream.close();
        outputStream.close();

    }
}
