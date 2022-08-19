package exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class AutoCloseableDemo {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("dos.dat");){
            fos.write(1);
        }catch (IOException e){
            System.out.println("粗错了");
        }
    }
}
