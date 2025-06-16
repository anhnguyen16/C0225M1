package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/23
 * Time: 20:37 ${AM_PM}
 */
public class Main {
    public static void main(String[] args) {
        // Một tham chiếu lớp cha có thể tham chiếu đến một đối tượng lớp con
//        Animal animal = new Dog();
//        animal.makeSound();
//        animal.eat();
//
//        Dog beagle = new Dog();
//        beagle.makeSound();
//        beagle.eat();
//
//        Animal cat = new Cat();
//        cat.makeSound();
//        cat.eat();
//
//        Runnable catRunnable = new Cat();
//        Cat cat1 = (Cat) catRunnable; // Explicit casting
//        cat1.makeSound();
//        cat1.run();

//        Bird bird = new Bird();
//        bird.fly();
//        bird.makeSound();
//        bird.eat();
//        bird.run();
//
//        Flyable birdFlyable = bird; // Implicit casting
//        birdFlyable.fly();

        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Bay như máy bay B52...");
            }
        };
        flyable.fly();
    }
}