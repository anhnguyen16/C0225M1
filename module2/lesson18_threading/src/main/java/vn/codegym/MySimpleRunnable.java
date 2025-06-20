package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/20
 * Time: 19:05
 */

// B1: Tao mot lop implements Runnable
public class MySimpleRunnable implements Runnable {
    private String taskName;

    public MySimpleRunnable() {
    }

    public MySimpleRunnable(String taskName) {
        this.taskName = taskName;
    }

    // B2: Trien khai phuong thuc run() de dinh nghia cong viec cua luong thuc thi
    @Override
    public void run() {
        System.out.println(taskName + ": Bat dau thuc hien cong viec");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000); // Mo phong cong viec dang thuc hien
                System.out.println(taskName + ": Cong viec " + (i + 1) + " da hoan thanh");
            } catch (InterruptedException e) {
                System.out.println(taskName + ": Da bi gian doan");
                Thread.currentThread().interrupt(); // Dat lai trang thai bi gian doan
            }
        }
        System.out.println(taskName + ": Da hoan thanh tat ca cong viec");
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
