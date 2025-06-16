package org.example;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/16
 * Time: 20:27
 */
public class FileDemo {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("students_codegym.txt"); // Tao doi tuong File tro den file students_codegym.txt

        // Kiem tra xem no dang tro den thu muc nao?
        System.out.println(file.getAbsoluteFile());

        try {
            if (!file.exists()) {
                file.createNewFile(); // Tao moi mot tap tin neu no chua ton tai
            }
        } catch (IOException e) {
            System.out.println("Khong co quyen tao tap tin: " + e.getMessage());
        }

        if (file.isDirectory()) {
            System.out.println("File " + file.getName() + " la mot thu muc.");
        } else if (file.isFile()) {
            System.out.println("File " + file.getName() + " la mot tap tin.");
        } else {
            System.out.println("File " + file.getName() + " khong phai la tap tin hay thu muc.");
        }
    }
}
