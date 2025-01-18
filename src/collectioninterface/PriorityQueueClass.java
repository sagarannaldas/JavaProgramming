package collectioninterface;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(100);
        pq.add(10);
        pq.add(20);
        pq.add(50);
        pq.add(200);
        pq.add(500);
        pq.add(1);

        System.out.println(pq);
    }
}
