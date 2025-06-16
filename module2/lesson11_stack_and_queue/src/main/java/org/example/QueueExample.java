package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 19:31
 */
public class QueueExample {
    public static void main(String[] args) {
        GenericQueue<String> queue = new GenericQueue<>();
        queue.enqueue("Hanoi");
        queue.enqueue("HCM");
        queue.enqueue("Danang");

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
