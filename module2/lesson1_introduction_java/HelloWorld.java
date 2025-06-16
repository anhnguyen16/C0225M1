import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/09
 * Time: 20:53
 */
public class HelloWorld {

    // Properties

    public static void main(String[] args) {
//        System.out.println("Xin chào lớp C0225M1");
//        cú pháp: datatype variableName;
        // number: byte, short, int, long (số nguyên)
        // floating point: float, double
        // boolean
        // char: Ký tự đơn
        // String: Chuỗi
//        byte age = 30;
//        short s = 100;
//        int i = 1000;
//        long l = 100000000L;
//
//        System.out.println(age);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(l);
//
//        float f = 2.0f;
//        double d = 3.14569;
//        System.out.println(f);
//        System.out.println(d);
//
//        final String MAX_SIZE = "25";
//        int x, y, z;
//        x = 10;
//        y = 20;
//        z = ++x + y;
//        System.out.println(z); // 31
//        System.out.println(x); // 11

        // Scanner: datatype
        // sc: variableName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tuổi của bạn: ");
        int age = sc.nextInt();
        sc.nextLine(); // Phải có sau khi lấy số từ bàn phím
        System.out.println("Nhập vào tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Tuoi cua ban la: " + age);
        System.out.println("Tên của bạn là: " + name);
    }
}
