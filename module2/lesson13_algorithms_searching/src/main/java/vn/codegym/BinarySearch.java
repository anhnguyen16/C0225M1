package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/06
 * Time: 21:02
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {6, 13, 14, 25, 33, 43, 51, 53, 64, 72, 84, 93, 95, 96, 97};

        int target = 13;
        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Tim thay phan tu " + target + " co trong mang tai vi tri: " + result);
        } else {
            System.out.println("Khong tim thay phan tu " + target + " trong mang");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
