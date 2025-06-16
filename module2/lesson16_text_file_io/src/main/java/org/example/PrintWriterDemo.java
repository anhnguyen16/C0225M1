package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/16
 * Time: 20:57
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        // try-with-resources to ensure the PrintWriter is closed automatically
        try (FileWriter fileWriter = new FileWriter("output.txt", true);
             PrintWriter writer = new PrintWriter(fileWriter)) {
            writer.print("Long");
            writer.println(1997);
            writer.print("Hai");
            writer.println(2000);
            writer.printf("Phuong %d\n", 2001);
            writer.printf("Score %.2f\n", 123.456789);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
