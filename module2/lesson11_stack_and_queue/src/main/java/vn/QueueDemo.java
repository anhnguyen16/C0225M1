package vn;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 * User: WanBi (wanbi (anhnbt.it@gmail.com))
 * Date: 2025/06/02
 * Time: 21:10
 */
public class QueueDemo {
    public static void main(String[] args) {
        List<Integer> queueTicketGD = new LinkedList<>();
        queueTicketGD.add(2);
        queueTicketGD.add(4);
        queueTicketGD.add(5);
        queueTicketGD.add(99);
        queueTicketGD.add(56);

        Collections.sort(queueTicketGD, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        for (Integer ticket : queueTicketGD) {
            System.out.println("Ticket number: " + ticket);
        }
    }
}
