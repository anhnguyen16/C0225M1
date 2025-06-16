package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/16
 * Time: 20:50
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("students_codegym.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay tap tin: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Co loi khi doc tap tin: " + e.getMessage());
        }
    }
}
