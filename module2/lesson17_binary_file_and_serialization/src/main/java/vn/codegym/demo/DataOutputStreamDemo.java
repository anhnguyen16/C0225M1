package vn.codegym.demo;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/18
 * Time: 20:19
 */
public class DataOutputStreamDemo {
    public static void main(String[] args) {
        try {
            // binary, data => .bin, .dat
            FileOutputStream fos = new FileOutputStream("output.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.write(80); // Ghi một byte
            dos.writeUTF("Hello");
            dos.writeDouble(3.14159); // Ghi một số thực

            dos.close(); // Đóng luồng để đảm bảo dữ liệu được ghi
            fos.close(); // Đóng luồng FileOutputStream
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
