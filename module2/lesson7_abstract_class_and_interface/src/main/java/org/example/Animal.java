package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/23
 * Time: 20:39
 */
public abstract class Animal {
    protected String name;
    // Khai báo phương thức abstract
    public abstract void makeSound();

    public void eat() {
        System.out.println("Dong vat dang an cut...");
    }
}
