package org.example;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 19:41
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("Hanoi");
        queue.offer("HCM");
        queue.offer("Danang");
        queue.offer("Bac Giang");

        System.out.println("Priority queue using Comparable:");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove() + " ");
        }

        PriorityQueue<String> queue2 = new PriorityQueue<>(4, Collections.reverseOrder());
        queue2.offer("Hanoi");
        queue2.offer("HCM");
        queue2.offer("Danang");
        queue2.offer("Bac Giang");
        System.out.println("\nPriority queue using Comparator (reverse order):");
        while (!queue2.isEmpty()) {
            System.out.println(queue2.remove() + " ");
        }
    }
}
