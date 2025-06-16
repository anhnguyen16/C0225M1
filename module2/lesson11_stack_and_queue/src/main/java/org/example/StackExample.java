package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 19:27
 */
public class StackExample {
    public static void main(String[] args) {

        MyStack<String> stack = new MyStack<>();
        stack.push("Hanoi");
        stack.push("HCM");
        stack.push("Danang");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
