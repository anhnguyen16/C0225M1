package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/06
 * Time: 19:47
 */
public class LinearSearch {
    public static void main(String[] args) {
        // Example array to search
        int[] arr = {5, 3, 8, 4, 2};
        // Element to search for
        int target = 4;

        // Perform linear search
        int index = linearSearch(arr, target);

        // Output the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    private static int linearSearch(int[] arr, int target) {
        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if the target is not found
    }
}
