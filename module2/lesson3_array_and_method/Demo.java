/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/14
 * Time: 20:46
 */
public class Demo {
    public static void main(String[] args) {
        // Cú pháp khai báo mảng: data_type[] arr;
//        int[] nums;
//        String[] names;
        // Cú pháp khởi tạo mảng: new data_type[size];
//        nums = new int[3];
//        names = new String[30];
        // Cú pháp ngắn gọn: array initializer
//        int[] numbers = {1, 2, 3};
        // => tương đương khi Java biên dịch
//        int[] numbers = new int[3] {1, 2, 3};
        // Thao tác với giá trị
//        numbers[0] = 111;
//        numbers[1] = 222;
//        numbers[2] = 333;
//        // Duyệt mảng
//        // Cách 1: dùng for truyền thống
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("Vi tri thu " + i + " co gia tri la " + numbers[i]);
//        }
//        // Cách: hiện đại và phổ biến: for-each
//        for (int item : numbers) {
//            System.out.println(item);
//        }
//            String[] cars = {"VinFast", "Bentley", "BMW"};
//            for (String car : cars) {
//                System.out.println(car);
//            }
//        int total = add(10, 10);
//        // sub, div, mul
//        System.out.println(total);
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(totalOfArray(numbers));
    }

    public static int totalOfArray(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

//    public static int add(int a, int b) {
//        return a + b;
//    }
}
