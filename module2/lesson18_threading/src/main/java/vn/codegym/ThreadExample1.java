package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/20
 * Time: 19:02
 */
public class ThreadExample1 {
    public static void main(String[] args) {
        System.out.println("Bat dau chuong trinh chinh...");
// B3: Tao doi tuong thread va goi phuong thuc start()
        MySimpleThread thread1 = new MySimpleThread("Xin chao tu Thread 1");
        thread1.setName("Thread-LIKE"); // Dat ten cho luong thuc thi
        thread1.start(); // Bat dau luong thuc thi

        MySimpleThread thread2 = new MySimpleThread("Xin chao tu Thread 2");
        thread2.setName("Thread-LOVE"); // Dat ten cho luong thuc thi
        thread2.start(); // Bat dau luong thuc thi

        System.out.println("Ket thuc chuong trinh chinh...");

    }
}
