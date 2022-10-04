import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayLists {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); // declare an empty ArrayList
        nums.add(1); // adds an element in ArrayList
        nums.add(2);
        nums.add(3);
        System.out.println(nums);

        nums.add(1, 50); // adds an element at particular index
        System.out.println(nums);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);
        nums.addAll(newList); // adds all the element of a list
        System.out.println(nums);
        System.out.println(nums.get(1)); // get an element from a particular index

        ArrayList<Integer> List = new ArrayList<>();
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);
        List.add(60);
        List.add(70);
        List.add(80);
        System.out.println(List);
        for (int i = 0; i < List.size(); i++) {
            System.out.println("The element is " + List.get(i));
        }
        
        for (int i: List) {
            System.out.println("The element is " + i);
        }

        Iterator<Integer> it = List.iterator();

        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }

        // List.set(2, 1000); // changes an existing element at particular index
        // System.out.println(List);

        // List.remove(1);
        // System.out.println(List); // removes element from a particular index

        // List.remove(Integer.valueOf(30)); // removes element which matches it's value
        // System.out.println(List);

        // List.clear(); // clears whole arraylist
        // System.out.println(List);
    }
}