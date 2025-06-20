package vn.codegym.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/18
 * Time: 20:47
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.dat"));
            System.out.println(ois.readUTF());
            System.out.println(ois.readInt());
            Date date = (Date) ois.readObject(); // explicit casting
            System.out.println(date); // This will print the date object
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
