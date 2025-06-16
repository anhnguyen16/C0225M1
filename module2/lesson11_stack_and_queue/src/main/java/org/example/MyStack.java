package org.example;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 19:13
 */
public class MyStack<E> {
    private static final int INITIAL_SIZE = 16;
    private E[] elements;
    private int count = 0; // number of elements in stack

    public MyStack() {
        elements = (E[]) new Object[INITIAL_SIZE]; // generic array workaround
    }

    // Push element to top of stack
    public void push(E e) {
        ensureCapacity(); // đảm bảo còn chỗ trống
        elements[count++] = e; // thêm phần tử vào và tăng count
    }

    // Pop element from top of stack
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        E item = elements[--count];
        elements[count] = null; // avoid memory leak
        return item;
    }

    // Pick element at top without removing
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[count - 1];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Ensure enough capacity in underlying array
    private void ensureCapacity() {
        if (count >= elements.length) {
            E[] newElements = (E[]) new Object[elements.length * 2 + 1];
            System.arraycopy(elements, 0, newElements, 0, count);
            elements = newElements;
        }
    }
}
