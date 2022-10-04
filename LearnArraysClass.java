import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(numbers, 4); // returns index of an element through binary search
        System.out.println(index);

        int [] nums = {32, 2, 45, 23, 35, 65};
        Arrays.sort(nums); // sorts in ascending order

        Arrays.fill(nums, 12); // fills all the places of array

        for (int i: nums) {
            System.out.print(i + " ");
        }
    }
}
