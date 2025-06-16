package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/21
 * Time: 20:29
 */
public class Car {
    private String color = "Black";
    private String name;

    public Car() {
        System.out.println("Phương thức khởi tạo không tham số của lớp Car được gọi!");
    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void driving() {
        System.out.println("Driving car...");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
