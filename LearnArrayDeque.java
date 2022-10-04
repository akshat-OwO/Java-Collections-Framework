import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>(); //declare an empty ArrayDeque
        // similar methods like queue
        adq.offer(23);
        adq.offerFirst(12); // inserts element from starting of queue
        adq.offerLast(45); // inserts element from ending of queue
        adq.offer(24);

        System.out.println(adq);
        
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst()); // returns first element
        System.out.println(adq.peekLast()); // returns last element
        
        System.out.println(adq.poll());
        System.out.println("poll() " + adq);

        System.out.println(adq.pollFirst()); // removes first element
        System.out.println("pollFirst() " + adq);
        System.out.println(adq.pollLast()); // removes last element
        System.out.println("pollLast() " + adq);
    }
}
