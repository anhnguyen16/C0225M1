package vn.codegym.demo;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/20
 * Time: 20:19
 */
public class MyThread extends Thread {

// Ghi de phuong thuc run() cua lop cha (Thread)

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread() + ": dang chay... (" + i + ")");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + ": bi gian doan ");
            }
        }
    }
}
