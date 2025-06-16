package vn.codegym;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/06
 * Time: 20:39
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {99, 1, 2, 3, 4, 5, 11, 22, 33, 55, 44}; // local variable
        System.out.println(numbers.length);
        System.out.println("Mang ban dau: ");
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Mang sau khi sap xep: ");
        System.out.println(Arrays.toString(numbers));


        int target = 4;
        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Tim thay phan tu " + target + " co trong mang tai vi tri: " + result);
        } else {
            System.out.println("Khong tim thay phan tu " + target + " trong mang");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
