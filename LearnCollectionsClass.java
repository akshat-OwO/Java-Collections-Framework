import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(32);
        list.add(23);
        list.add(8);
        list.add(43);
        list.add(12);
        System.out.println(list);

        System.out.println("min element " + Collections.min(list)); // returns element which has minimum value
        System.out.println("max element " + Collections.max(list)); // returns element which has maximum value
        System.out.println(Collections.frequency(list, 8)); // return no. of times an element has occur

        Collections.sort(list); // sorts in ascending order
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder()); // sorts in descending order
        System.out.println(list);
    }
}
