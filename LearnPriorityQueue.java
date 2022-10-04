import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); // declare an empty PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // using a comparator to reverse order
        // similar methods like queue
        pq.offer(40);
        pq.offer(36);
        pq.offer(24);
        pq.offer(12);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}
