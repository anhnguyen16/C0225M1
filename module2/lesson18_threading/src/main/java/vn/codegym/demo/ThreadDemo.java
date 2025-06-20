package vn.codegym.demo;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/20
 * Time: 20:23
 */
public class ThreadDemo {
    public static void main(String[] args) {
        // Luong chinh
        System.out.println(Thread.currentThread() + " DANG CHAY.....");
        System.out.println();
        MyThread myThread = new MyThread();
        myThread.setName("Thread-HAHA");
        myThread.setPriority(Thread.MIN_PRIORITY);

        MyThread myThread2 = new MyThread();
        myThread2.setName("Thread-SAD");
        myThread2.setPriority(Thread.MAX_PRIORITY);

        MyThread myThread3 = new MyThread();
        myThread3.setName("Thread-LOVE");
        myThread3.setPriority(Thread.MIN_PRIORITY);

        myThread.start(); // Kich hoat thread (tu dong goi phuong thuc run())
        myThread2.start();
        myThread3.start();

//        MyRunnable r = new MyRunnable();
//        Thread t = new Thread(r);
//        t.start();
//
//        MyRunnable r1 = new MyRunnable();
//        Thread t1 = new Thread(r1);
//        t1.start();
//
//        MyRunnable r2 = new MyRunnable();
//        Thread t2 = new Thread(r2);
//        t2.start();

//        new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("T1 Dang chay....");
//                }
//            }
//        }.start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("T2 Dang chay....");
//            }
//        }).start();

//        new Thread() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("Dang chay....");
//                }
//            }
//        }.start();

        System.out.println("Ket thuc chuong trinh");
    }
}
