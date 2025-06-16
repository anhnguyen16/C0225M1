package org.example;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 19:39
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Hanoi");
        queue.offer("HCM");
        queue.offer("Danang");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
