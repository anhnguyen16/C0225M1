package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 20:27
 */
public abstract class Animal {
    private String name;
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
