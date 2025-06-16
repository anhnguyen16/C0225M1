package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/16
 * Time: 20:38
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        File file = new File("students_codegym.txt"); // Tao doi tuong File tro den file students_codegym.txt

        try {
            FileWriter writer = new FileWriter("students_codegym.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hoc vien: Bui Tien Dung\nTrung tam: Becamec Binh Duong\nLop: Khong biet"); // Ghi thong tin hoc vien CodeGym vao file
            bufferedWriter.write("Hoc vien: Bui Tien Dung\nTrung tam: Becamec Binh Duong\nLop: Khong biet");
            bufferedWriter.write("Hoc vien: Bui Tien Dung\nTrung tam: Becamec Binh Duong\nLop: Khong biet");
            bufferedWriter.write("Hoc vien: Bui Tien Dung\nTrung tam: Becamec Binh Duong\nLop: Khong biet");
            bufferedWriter.close(); // Dong FileWriter sau khi ghi xong
            System.out.println("Da ghi thong tin hoc vien CodeGym vao file thanh cong!");
        } catch (IOException e) {
            System.out.println("Co loi khi mo file: " + e.getMessage());
        }
    }
}
