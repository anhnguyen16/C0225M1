package org.example;

import java.util.LinkedList;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 19:30
 */
public class GenericQueue<E> {
    private LinkedList<E> elements;

    public GenericQueue() {
        elements = new LinkedList<>();
    }

    public void enqueue(E e) {
        elements.addLast(e);
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements.removeFirst();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
