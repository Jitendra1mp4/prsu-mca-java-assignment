import myPack.Intro;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
    public static void main(String[] args) {
        Intro.print("HashSet Class & its methods");

        HashSet<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Adding elements
        System.out.println("Enter elements for the HashSet (type 'exit' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            set.add(input);
        }

        System.out.println("HashSet: " + set);

        // Check if set contains an element
        System.out.print("Enter an element to check: ");
        String elementToCheck = scanner.nextLine();
        System.out.println("Contains '" + elementToCheck + "': " + set.contains(elementToCheck));

        // Remove an element
        System.out.print("Enter an element to remove: ");
        String elementToRemove = scanner.nextLine();
        set.remove(elementToRemove);
        System.out.println("After removing '" + elementToRemove + "': " + set);

        // Size of the set
        System.out.println("Size of HashSet: " + set.size());

        // Iterating over the elements
        System.out.println("Iterating over HashSet:");
        for (String item : set) {
            System.out.println(item);
        }
    }
}
