package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/03
 * Time: 09:15 ${AM_PM}
 */
public class Main {
    public static void main(String[] args) {
        // Cach 1: Su dung String literal
//        String s1 = "Hello"; // Duoc luu trong String Pool

        // Cach 2: Su dung tu khoa new
//        String s2 = new String("Hello");

        // So sanh chuoi s1 va s2
//        System.out.println(s1 == s2); // false - khac tham chieu
//        System.out.println(s1.equals(s2)); // true - cung noi dung
//
//        String s = "Hello";
//        s = s + " World"; // Khong thay doi doi tuong ban dau, ma tao doi tuong moi

        // Thuc su dien ra:
        // 1. Tao doi tuong String moi voi noi dung "Hello World"
        // 2. Bien s gio tro den doi tuong moi
        // 3. Doi tuong cu "Hello" van ton tai trong bo nho va khong thay doi

//        // Truy xuat
//        System.out.println(s.length()); // Tra ve do dai chuoi
//        System.out.println(s.charAt(0)); // Tra ve ky tu tai vi tri chi dinh (tu 0)
//        System.out.println(s.getBytes(StandardCharsets.UTF_8)); // Chuyen doi thanh mang byte
//        System.out.println(s.toCharArray()); // chuyen doi thanh mang ky tu
//
//        // So sanh
//        System.out.println(s1.equals(s2)); // So sanh noi dung chuoi (phan biet hoa/thuong)
//        System.out.println(s1.equalsIgnoreCase(s2)); // So sanh khong phan biet hoa/thuong
//        System.out.println(s1.compareTo(s2)); // so sanh theo thu tu tu dien
//        System.out.println(s1.startsWith("H")); // kiem tra tien to, hau do
//        System.out.println(s1.contains("o")); // Kiem tra chuoi con
//
//        // Tim kiem va trich xuat
//        System.out.println(s1.indexOf("o")); // Tim vi tri xuat hien dau chuoi
//        System.out.println(s1.indexOf("o")); // Tim vi tri xuat hien cuoi chuoi
//        System.out.println(s1.substring(1));
//        System.out.println(s1.split("o"));
//
//        // Bien doi
//        System.out.println(s1.toLowerCase());
//        System.out.println(s2.trim());
//        System.out.println(s2.replace("o", "O"));
//        System.out.println(s1.concat(s2)); // Noi chuoi (tuong tuong voi toan tu +)
//
//        // Chuyen doi kieu
//        System.out.println(String.valueOf("1"));
//        System.out.println(Integer.parseInt("10"));

        // Cach khong hieu qua khi noi nhieu chuoi
//        String result = "";
//        for (int i = 0; i < 10000; i++) {
//            result += "so " + i + ", "; // Tao nhieu doi tuong tam thoi
//        }
//        System.out.println(result);

//        // Su dung StringBuilder hieu qua hon
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 10000; i++) {
//            sb.append("So ").append(i).append(", ");
//        }
//        String result = sb.toString();
//        System.out.println(result);
//        StringBuffer sbf = new StringBuffer();
//        for (int i = 0; i < 10_000; i++) {
//            sbf.append("Thread-safe");
//        }
//
//
        // Tao Pattern
        // \d: (chu so) tuong tuong [0-9]
        // {n}: (dung n lan), {n,} (it nhat n lan), {n,m} (tu n den m lan)
//        Pattern pattern = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
//
//        // Tao Matcher
//        Matcher matcher = pattern.matcher("123-45-6789");
//
//        // Kiem tra so khoi
//        boolean matches = matcher.matches(); // true
//
//        // Phuong thuc tien ich cua lop String
//        // Cach 1: Su dung phuong thuc matches cua String
//        boolean isMatch = "123-45-6789".matches("\\d{3}-\\d{2}-\\d{4}");
//        System.out.println(isMatch);
//
//        // Cach 2: Tim kiem va thay the
//        String result = "Date: 2025-06-03".replaceAll("(\\d{4})-(\\d{2})-(\\d{2})", "$3/$2/$1");
//        System.out.println(result);

        // Validate email
//        String email = "anhnbt.it@gmail.com";
//        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
//        System.out.println(email.matches(emailRegex));

        // Validate phone
        // Mau (xxx) xxx-xxxx
//        String phone = "(012) 345-6789";
//        String phoneRegex = "\\(\\d{3}\\)\\s\\d{3}-\\d{4}";
//        System.out.println(phone.matches(phoneRegex));

        // Kiem tra mat khau manh
//        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
//        String password = "KhoaiTay@2019";
//        System.out.println(password.matches(passwordRegex));

//        String bookCodeRegex = "^BOOK-\\d{4}$";
//        System.out.println("BOOK-1234".matches(bookCodeRegex));

        String employeeCodeRegex = "^NV-\\d{4}$";
        String employeeCode = "NV-0001";
        boolean isValidEmployeeCode = employeeCode.matches(employeeCodeRegex);
        System.out.println(isValidEmployeeCode);

        String studentCodeRegex = "^HV-\\d{4}$";
        String studentCode = "HV-0001";
        boolean isValidStudentCode = studentCode.matches(studentCodeRegex);
    }

}