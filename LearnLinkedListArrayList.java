import java.util.LinkedList;
import java.util.List;

public class LearnLinkedListArrayList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(); // implementation of LinkedList using List interface

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        list.remove(3);
        System.out.println(list.size());
        System.out.println(list);
    }
}
