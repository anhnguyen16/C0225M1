package vn.codegym.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/18
 * Time: 20:41
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.dat"));
            oos.writeUTF("Hello, World!");
            oos.writeInt(42);
            oos.writeObject(new Date());

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
