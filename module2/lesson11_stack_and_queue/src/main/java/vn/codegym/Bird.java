package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 20:33
 */
public class Bird extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
