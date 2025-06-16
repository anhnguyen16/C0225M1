package p2;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/19
 * Time: 19:08
 */
public class Person {
    // access modifier
    String name; // instant variable
    static String classes = "CodeGym"; // class variable
    static String language;

    static {
        if (System.getProperty("lang") != null && System.getProperty("lang").equals("vi")) {
            language = "Vietnamese";
        } else {
            language = "English";
        }
    }

    public Person(String name) {
        this.name = name;
    }

//    public static void main(String[] args) {
//        Person longg = new Person("Long");
//        Person trung = new Person("Trung");
//        Person hai = new Person("Mr Hai");
//        longg.name = "Lê Hải Long"; // name = instant variable
//        Person.classes = "FPT";
//        System.out.println(longg.name + ", lớp: " + Person.classes);
//        System.out.println(trung.name + ", lớp: " + Person.classes);
//        System.out.println(hai.name + ", lớp: " + Person.classes);
//        System.out.println(Person.language);
//
//        // class variable: static
//    }

    // getter/setter
}
