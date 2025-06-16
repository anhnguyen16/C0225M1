package p1;

import p2.Person;
import p2.Student;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/19
 * Time: 18:47
 */
public class Demo {
    public static void main(String[] args) {
//        int a = 10;
//        int b = a; // b = 10;
//        a = 100;
//        System.out.println("Giá trị của a trước khi swap là: " + a);
//        System.out.println("Giá trị của b trước khi swap là: " + b);
//        swap(a, b);
//        System.out.println("Giá trị của a sau khi swap là: " + a);
//        System.out.println("Giá trị của b sau khi swap là: " + b);

//        int[] arr = new int[2];
//        arr[0] = 10;
//        arr[1] = 20;
//        int[] arr2 = arr; //
//        System.out.println(arr);
//        System.out.println(arr2);
//        System.out.println("Trước khi gọi method swap: " + Arrays.toString(arr));
//        arr2[1] = 99;
////        swap(arr);
//        System.out.println("Sau khi gọi method swap: " + Arrays.toString(arr));
//        Person p1;


        Student student = new Student();
//        student.grade = 20;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Giá trị của a bên trong method swap: " + a);
        System.out.println("Giá trị của b bên trong method swap: " + b);
    }

    public static void swap(int[] numbers) {
        int temp = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = temp;
    }
}
