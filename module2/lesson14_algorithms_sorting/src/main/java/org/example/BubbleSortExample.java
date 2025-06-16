package org.example;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/09
 * Time: 18:52
 */
public class BubbleSortExample {
    public static void main(String[] args) {
        int[] numbers = {2, 9, 5, 4, 8, 1};

        System.out.println("Mang numbers truoc khi sap xep");
        System.out.println(Arrays.toString(numbers));
        System.out.println("Mang numbers sau khi sap xep: ");
        BubbleSort.bubbleSort(numbers, numbers.length);
        System.out.println(Arrays.toString(numbers));

    }
}
