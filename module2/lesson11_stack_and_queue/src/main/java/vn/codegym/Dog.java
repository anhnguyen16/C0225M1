package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 20:27
 */
public class Dog extends Animal {
    public void beFriendly() {
        System.out.println("Dog wags its tail");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
}
