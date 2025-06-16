package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/30
 * Time: 16:25
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // Khoi tao ArrayList
        List<String> fruits = new ArrayList<>();

        LinkedList<String> s;

        // Them phan tu
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Truy cap phan tu
        System.out.println("Phan tu thu 2: " + fruits.get(1));

        // Duyet ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Xoa phan tu
        fruits.remove("Banana");

        // Kiem tra kich thuoc
        System.out.println("Kich thuoc: " + fruits.size());
    }
}
