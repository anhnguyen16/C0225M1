package org.example;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/11
 * Time: 20:52
 */
public class Helper {

    public static int inputNumber(Scanner scanner) throws RuntimeException {
        int number = scanner.nextInt();
        if (number < 18 || number > 34) {
            throw new RuntimeException("Goi vao day loi khi number < 18 hoac number > 34");
        }
        return number;
    }
}
