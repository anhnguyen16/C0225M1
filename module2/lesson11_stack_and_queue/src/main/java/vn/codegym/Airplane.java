package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 20:34
 */
public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is flying at high altitude");
    }
}
