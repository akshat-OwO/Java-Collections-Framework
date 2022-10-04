import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>(); // declares an empty set which stores elements using hash
        // Set<Integer> set = new LinkedHashSet<>(); //declares an empty set which stores elements using LinkedList
        Set<Integer> set = new TreeSet<>(); // declares an empty set which sorts elements using binary search
        // no duplicates allowed
        set.add(32);
        set.add(12);
        set.add(56);
        set.add(34);
        set.add(12);
        set.add(45);
        set.add(76);

        System.out.println(set);

        set.remove(45);
        System.out.println(set);
        
        System.out.println(set.contains(12)); // returns true/false if element matches/not matches

        System.out.println(set.isEmpty()); // returns true/false

        System.out.println(set.size()); // returns size of set

        set.clear();
        System.out.println(set);
    }
}
