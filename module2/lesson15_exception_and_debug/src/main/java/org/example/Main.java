package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/11
 * Time: 20:17 ${AM_PM}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Moi nhap vao so thu nhat: ");
//        int firstNumber = scanner.nextInt();
//        System.out.println("Moi nhap vao so thu hai: ");
//        int secondNumber = scanner.nextInt();
//        System.out.println("Ket qua a / b = " + (firstNumber / secondNumber));
//        System.out.println("Ket thuc chuong trinh");

        // InputMismatchException: Unchecked Exception

        try {
            Student student = new Student();
            System.out.println("Moi nhap ten cua ban: ");
            String name = scanner.nextLine();
            System.out.println("Moi nhap tuoi cua ban: ");
            int age = Helper.inputNumber(scanner);

            student.setName(name);
            student.setAge(age); // Canh bao co loi xay ra ngay tai thoi diem compile

            System.out.println(student);
        } catch (StudentAgeException e) {
            e.printStackTrace();
        }
    }
}