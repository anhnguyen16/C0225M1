/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/16
 * Time: 20:29
 */
public class Person {
    private String name;
    public int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String _name, int _age) {
        name = _name;
        age = _age;
    }

    String speak() {
        if (this.age >= 2) {
            return "Hello";
        } else {
            return "Oe oe";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
