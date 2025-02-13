/*
(This exercise cannot be graded automatically by the Check Exercises app)

19.3 (Distinct elements in ArrayList) Write the following method that
returns a new ArrayList. The new list contains the non-duplicate elements
from the original list.

(Method header:)
public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 */


import java.util.ArrayList;

public class Exercise19_03 {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        // Create a new list to store unique elements
        ArrayList<E> uniqueList = new ArrayList<>();

        // Iterate through the original list
        for (E element : list) {
            // Only add the element if it's not already in uniqueList
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }

        // Return the new list with unique elements
        return uniqueList;
    }

    // Test the method
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(6);

        System.out.println("Original list: " + numbers);
        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("List after removing duplicates: " + uniqueNumbers);
    }
}
