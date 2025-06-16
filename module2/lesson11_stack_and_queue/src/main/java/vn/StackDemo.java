package vn;

import java.util.Stack;
import java.util.Vector;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 21:00
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> histories = new Stack<>();
        histories.add("https://www.duolingo.com");
        histories.add("https://www.google.com");
        histories.add("https://www.facebook.com");

        System.out.println("Current history: " + histories);

        System.out.println(histories.pop() + " has been removed from history.");
        System.out.println(histories.pop() + " has been removed from history.");
        System.out.println(histories.pop() + " has been removed from history.");
        System.out.println(histories.pop() + " has been removed from history.");
    }
}
