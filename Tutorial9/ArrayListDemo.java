import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Fig");

        // Display the ArrayList
        System.out.println("ArrayList of fruits: " + fruits);

        // Size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);

        // Check if the ArrayList is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);

        // Access elements by index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Modify an element by index
        fruits.set(1, "Grapes");
        System.out.println("Modified ArrayList: " + fruits);

        // Remove an element by value
        boolean removed = fruits.remove("Date");
        System.out.println("ArrayList after removing 'Date': " + fruits);

        // Iterate through the ArrayList using an Iterator
        System.out.print("Iterating through the ArrayList: ");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Convert ArrayList to an array
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.print("Array from ArrayList: ");
        for (String fruit : fruitArray) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Clear the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);
    }
}
