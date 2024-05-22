import myPack.Intro;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        Intro.print("LinkedList Class & its methods");

        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding elements
        System.out.println("Enter elements for the LinkedList (type 'exit' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            linkedList.add(input);
        }

        System.out.println("LinkedList: " + linkedList);

        // Adding element at the first position
        System.out.print("Enter an element to add at the first position: ");
        String firstElement = scanner.nextLine();
        linkedList.addFirst(firstElement);
        System.out.println("After adding at the first position: " + linkedList);

        // Adding element at the last position
        System.out.print("Enter an element to add at the last position: ");
        String lastElement = scanner.nextLine();
        linkedList.addLast(lastElement);
        System.out.println("After adding at the last position: " + linkedList);

        // Accessing elements
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (index >= 0 && index < linkedList.size()) {
            System.out.println("Element at index " + index + ": " + linkedList.get(index));
        } else {
            System.out.println("Index out of bounds");
        }

        // Removing an element
        System.out.print("Enter an index to remove: ");
        int removeIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (removeIndex >= 0 && removeIndex < linkedList.size()) {
            linkedList.remove(removeIndex);
            System.out.println("After removing element at index " + removeIndex + ": " + linkedList);
        } else {
            System.out.println("Index out of bounds");
        }

        // Size of the LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());

        // Iterating over the elements
        System.out.println("Iterating over LinkedList:");
        for (String item : linkedList) {
            System.out.println(item);
        }
    }
}
