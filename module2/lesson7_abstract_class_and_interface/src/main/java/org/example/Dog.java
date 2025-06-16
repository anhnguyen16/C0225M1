package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/23
 * Time: 20:42
 */
public class Dog extends Animal implements Runnable {
    @Override
    public void makeSound() {
        System.out.println("Gâu gâu");
    }

    @Override
    public void eat() {
        System.out.println("Chó gặm xương");
    }

    @Override
    public void run() {
        System.out.println("Chạy như chó");
    }
}
