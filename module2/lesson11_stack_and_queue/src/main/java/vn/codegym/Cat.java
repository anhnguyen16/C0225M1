package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 20:30
 */
public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }

    public void scratch() {
        System.out.println("Cat scratches the furniture");
    }
}
