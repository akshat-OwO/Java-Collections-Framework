import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>(); // declare an empty Stack
        // First In Last Out(FILO)
        animals.push("lion"); // pushing an element into a Stack
        animals.push("horse");
        animals.push("dog");
        animals.push("cat");

        System.out.println("Stack: " + animals);
        System.out.println(animals.peek()); // returns the topmost element in a Stack
        animals.pop(); // removes the topmost/last element of a Stack
        System.out.println(animals.peek());
    }
}
