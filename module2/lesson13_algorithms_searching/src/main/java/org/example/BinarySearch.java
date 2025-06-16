package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/06
 * Time: 19:47
 */
public class BinarySearch {
    public static void main(String[] args) {

        // Example sorted array to search
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Element to search for
        int target = 6;

        // Perform binary search
        int index = java.util.Arrays.binarySearch(arr, target);

        // Output the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

//    private static int binarySearch(int[] arr, int target) {
//        int low = 0; // Start index
//        int hight = arr.length - 1; // End index
//
//        while (low <= hight) {
//            int mid = (low + hight) / 2; // Calculate middle index
//
//            // Check if the target is at mid
//            if (arr[mid] == target) {
//                return mid; // Return the index if found
//            }
//            // If target is greater, ignore low half
//            else if (arr[mid] < target) {
//                low = mid + 1;
//            }
//            // If target is smaller, ignore hight half
//            else {
//                hight = mid - 1;
//            }
//        }
//        return -1; // Return -1 if the target is not found
//    }
}
