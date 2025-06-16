package vn.codegym;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/05/30
 * Time: 20:24
 */
public class DemoCollection<E> {
    public static void main(String[] args) {
//        ArrayList<String> collection = new ArrayList<>(); // Cho phep chen phan tu trung lap, duy tri thu tu them vao
//        // Them 5 phan tu
//        collection.add("Long");
//        collection.add("Hai");
//        collection.add("Trung");
//        collection.add("Hung");
//        collection.add("Long"); // Duoc phep
//        System.out.println(collection.get(2)); // O(1)
//
//        // Duyet danh sach
//        System.out.println("Danh sach sinh vien tu ArrayList");
//        Iterator<String> iterator = collection.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        System.out.println();
        LinkedList<String> linkedList = new LinkedList<>(); // Cho phep chen phan tu trung lap, duy tri thu tu them vao
//        linkedList.add("Apple");
//        linkedList.add("Banana");
//        linkedList.add("Orange");
//        linkedList.add("Apple");
//        // Them vao dau va cuoi rat hieu qua
//        linkedList.addFirst("Táo mèo");
//        linkedList.addLast("Kiwi");
//        System.out.println("Phan tu tai vi tri thu 3: " + linkedList.get(3)); // O(n)
//        // Tao meo => Apple => Banana =>
//        // Duyet danh sach
//        System.out.println("Danh sach Hoa qua tu LinkedList");
//        Iterator<String> iteratorLinkedList = linkedList.iterator();
//        while (iteratorLinkedList.hasNext()) {
//            System.out.println(iteratorLinkedList.next());
//        }

//        ArrayList<Student> students = new ArrayList<>();
//        Student student = new Student(1, "Trung");
//        students.add(student);
//        // Duyet
//        for (Student std : students) {
//            System.out.println(std);
//        }

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<String> arrayList = new ArrayList<>(Arrays.asList("Trung", "Hai"));

        DemoCollection<String> collection = new DemoCollection<>();
        collection.print(arrayList);
    }

    public static <E> void print(List<E> numbers) {
        for (E item : numbers) {
            System.out.println(item);
        }
    }

    public static <E> void printString(List<String> numbers) {
        for (String item : numbers) {
            System.out.println(item);
        }
    }
}
