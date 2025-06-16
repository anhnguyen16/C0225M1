package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/09
 * Time: 20:51
 */
public class BubbleSort {
    // Overloading (Nạp chồng)
    public static void bubbleSort(int[] numbers) {
        bubbleSort(numbers, numbers.length);
    }

    public static void bubbleSort(int[] numbers, int length) {
        // Vong lap dau tien xac dinh co cap can duyet
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap (hoan doi)
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
