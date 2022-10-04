import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // implementation of LinkedList using Queue interface
        // First in First Out(FIFO)
        queue.offer(12); // adding elements in a Queue | returns true/false
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);

        System.out.println(queue.poll()); // removes first element in a queue | returns value
        System.out.println(queue);

        System.out.println(queue.peek()); // returns first element of a queue
    }
}
