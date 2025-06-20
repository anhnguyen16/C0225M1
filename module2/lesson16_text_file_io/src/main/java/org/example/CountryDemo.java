package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/16
 * Time: 21:06
 */
public class CountryDemo {

    private static List<Country> countries = new ArrayList<>();

    public static void main(String[] args) {

        // try-with-resources to ensure the BufferedReader is closed automatically
        try (FileReader fileReader = new FileReader("data/countries.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(",");
                int id = Integer.parseInt(tokens[0]);
                String code = tokens[1];
                String name = tokens[2];
                Country country = new Country(id, code, name);
                countries.add(country);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay tap tin: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Co loi khi doc tap tin: " + e.getMessage());
        }
        System.out.println("===== UNG DUNG QUAN LY QUOC GIA =====");
        System.out.println("1. Danh sach quoc gia");
        System.out.println("2. Them quoc gia");
        System.out.println("3. Sua quoc gia");
        System.out.println("4. Xoa quoc gia");
        System.out.println("5. Tim kiem quoc gia");
        System.out.println("0. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.print("Nhap lua chon: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayCountries();
                    break;
                case 2:
                    try {
                        addCountry();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Cam on ban da su dung ung dung!");
                    return;
                default:
                    System.out.println("Lua chon khong hop le, vui long chon lai.");
            }
        }
    }

    public static void displayCountries() {
        System.out.println("Danh sach quoc gia:");
        System.out.printf("%-5s %-10s %-20s\n", "ID", "Code", "Name");
        for (Country country : countries) {
            System.out.println(country);
        }
    }

    public static void addCountry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap id quoc gia:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi nhap ma quoc gia:");
        String code = scanner.nextLine();
        if (code.isEmpty()) {
            throw new RuntimeException("Ma quoc gia khong duoc de trong!");
        }
        System.out.println("Moi nhap ten quoc gia:");
        String name = scanner.nextLine();

        Country newCountry = new Country(id, code, name);
        countries.add(newCountry);
        System.out.println("Quoc gia moi da duoc them thanh cong!");
    }
}
