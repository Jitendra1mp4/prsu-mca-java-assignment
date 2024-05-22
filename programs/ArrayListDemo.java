import myPack.Intro;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Intro.print("ArrayList Class & its methods");

        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding elements
        System.out.println("Enter elements for the ArrayList (type 'exit' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            list.add(input);
        }

        System.out.println("ArrayList: " + list);

        // Accessing elements
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (index >= 0 && index < list.size()) {
            System.out.println("Element at index " + index + ": " + list.get(index));
        } else {
            System.out.println("Index out of bounds");
        }

        // Removing an element
        System.out.print("Enter an index to remove: ");
        int removeIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (removeIndex >= 0 && removeIndex < list.size()) {
            list.remove(removeIndex);
            System.out.println("After removing element at index " + removeIndex + ": " + list);
        } else {
            System.out.println("Index out of bounds");
        }

        // Size of the list
        System.out.println("Size of ArrayList: " + list.size());

        // Iterating over the elements
        System.out.println("Iterating over ArrayList:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
