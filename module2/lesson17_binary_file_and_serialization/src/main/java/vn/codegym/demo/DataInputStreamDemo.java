package vn.codegym.demo;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/18
 * Time: 20:28
 */
public class DataInputStreamDemo {

    public static final String FILE_DATA = "output.bin";

    public static void main(String[] args) {
        try {
            File file = new File(FILE_DATA);
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(FILE_DATA);
                DataInputStream dis = new DataInputStream(fis);
                System.out.println(dis.read());
                System.out.println(dis.readUTF());
                System.out.println(dis.readDouble());
            } else {
                System.out.println("File not found: " + file.getAbsolutePath());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
