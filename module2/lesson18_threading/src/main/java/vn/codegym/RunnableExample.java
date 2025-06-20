package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/20
 * Time: 19:08
 */
public class RunnableExample {

    public static void main(String[] args) {
        // B3: Tao doi tuong Runnable
        MySimpleRunnable likeTask = new MySimpleRunnable("Thread LIKE");
        Thread likeThread = new Thread(likeTask);

        MySimpleRunnable comment = new MySimpleRunnable("Thread LOVE");
        Thread commentThread = new Thread(comment);
        likeThread.start();
        commentThread.start();

        System.out.println("Chuong trinh chinh: Da goi start() cho cac luong thuc thi");
        try {
            likeThread.join(); // Cho den khi luong thuc thi LIKE hoan thanh
            commentThread.join(); // Cho den khi luong thuc thi LOVE hoan thanh
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
