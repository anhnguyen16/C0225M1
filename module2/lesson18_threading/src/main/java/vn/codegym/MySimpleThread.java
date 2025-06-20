package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/20
 * Time: 18:50
 */
// B1: Tao mot lop ke thua tu Thread
public class MySimpleThread extends Thread {
    private String message;

    public MySimpleThread(String message) {
        this.message = message;
    }


    // B2: Override phuong thuc run() de dinh nghia cong viec cua luong thuc thi
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + message); // 12
        try {
            Thread.sleep(3000); // Mo phong cong viec dang thuc hien
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ": Hoan thanh nhiem vu");
    }
}
