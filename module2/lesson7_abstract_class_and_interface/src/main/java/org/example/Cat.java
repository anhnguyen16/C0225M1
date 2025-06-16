package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/23
 * Time: 20:45
 */
public class Cat extends Animal implements Runnable {
    @Override
    public void makeSound() {
        System.out.println("Meo meo");
    }

    @Override
    public void run() {
        System.out.println("Chạy như mèo");
    }
}
