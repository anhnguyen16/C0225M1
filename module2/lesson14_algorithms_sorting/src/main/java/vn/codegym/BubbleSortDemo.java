package vn.codegym;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/09
 * Time: 20:51
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
//        int[] numbers = {2, 9, 4, 5, 8, 1};
//
//        System.out.println("Mang truoc khi sap xep: " + Arrays.toString(numbers));
//
////        BubbleSort.bubbleSort(numbers, numbers.length); // O(n2)
//
////        Collections.sort(numbers);
//        Arrays.sort(numbers); // O(nlog2n)
//
//        System.out.println("Mang sau khi sap xep: " + Arrays.toString(numbers));

        Student[] students = new Student[10];
        // Generate 10 students
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setName("Student " + (i + 1));
            students[i].setGrade((int) (Math.random() * 100)); // Random grade from 0 to 99
            students[i].setAge((int) (Math.random() * 120)); // Random grade from 0 to 120
        }
        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student.getName() + " - Grade: " + student.getGrade() + ", Age: " + student.getAge());
        }
        System.out.println("After sorting: ");
        Arrays.sort(students, new AgeComparator());
        for (Student student : students) {
            System.out.println(student.getName() + " - Grade: " + student.getGrade() + ", Age: " + student.getAge());
        }
    }
}
