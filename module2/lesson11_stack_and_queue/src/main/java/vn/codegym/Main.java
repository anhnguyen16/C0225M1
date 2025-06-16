package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 20:28
 */
public class Main {
    public static void main(String[] args) {
//        Animal dog = new Dog();
//        if (dog instanceof Dog) {
//            Dog d = (Dog) dog; // explicit casting
//            d.beFriendly();
//        } else {
//            System.out.println("dog is not an instance of Dog");
//        }
//        dog.getName();
//        dog.makeSound();
//
//        Animal cat = new Cat();
//        cat.setName("Mimi");
//        cat.makeSound();

//        Animal[] animals = new Animal[2];
//        System.out.println(animals.length);
//        animals[0] = new Cat();
//        animals[1] = new Dog();
//        for (Animal animal : animals) {
//            animal.makeSound();
//            if (animal instanceof Dog) {
//                Dog dog = (Dog) animal; // explicit casting
//                dog.beFriendly();
//            } else if (animal instanceof Cat) {
//                Cat cat = (Cat) animal; // explicit casting
//                cat.scratch();
//            }
//        }

        String name = new String("CodeGym");
        String agile = new String("CodeGym");
        System.out.println(agile);
        System.out.println(agile);
        System.out.println(name.equals(agile)); // true, because both refer to the same string literal in the string pool
    }
}
