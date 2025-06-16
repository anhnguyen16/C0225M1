package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/23
 * Time: 21:11
 */
public class Bird extends Animal implements Flyable, Runnable {
    @Override
    public void makeSound() {
        System.out.println("Chim hót");
    }

    @Override
    public void fly() {
        System.out.println("Chim bay");
    }

    @Override
    public void eat() {
        System.out.println("Chim đang ăn sâu bo...");
    }

    @Override
    public void run() {
        System.out.println("Chim chạy");
    }
}
