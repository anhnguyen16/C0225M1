package vn.codegym;

import java.util.regex.PatternSyntaxException;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/03
 * Time: 15:55
 */
public class StringDemo {
    public static void main(String[] args) {
        // Tao chuoi khong thay doi
        String message = "HELLO"; // String literal
        String message2 = "Hello"; // Tro den dia chi o nho da ton tai trong vung String Pool
        System.out.println(message == message2);

        String helle = new String("Hello"); //
        System.out.println(message == helle);
        System.out.println(message.equalsIgnoreCase(helle));

        // StringBuilder
        StringBuilder sb = new StringBuilder("Hello"); // Tao o nho moi trong heap
        sb.append(" ").append("World");
        System.out.println(sb.toString().equals(helle));
        PatternSyntaxException;

    }
}
