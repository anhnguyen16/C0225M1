package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/21
 * Time: 20:30
 */
public class LuxuryCar extends Car {

    public LuxuryCar() {
        super();
        System.out.println("Phương thức khởi tạo không tham số của lớp con LuxuryCar được gọi!");
    }

    public LuxuryCar(String name) {
        super(name);
    }

    public LuxuryCar(String name, String color) {
        super(color, name);
    }

    public void massage() {
        System.out.println("Massage feature...");
    }

    @Override
    public void driving() {
        System.out.println(super.getName() + " Đang chạy trên đường, có màu " + super.getColor());
    }

    @Override
    public String toString() {
        return "Đây là lớp Luxury " + super.toString();
    }
}
