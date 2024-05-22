import myPack.Intro;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        Intro.print("HashMap Class & its methods");

        HashMap<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Adding elements
        System.out.println("Enter elements for the HashMap (key-value pairs, type 'exit' to stop):");
        while (true) {
            System.out.print("Enter key: ");
            String key = scanner.nextLine();
            if (key.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter value: ");
            int value = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            map.put(key, value);
        }

        System.out.println("HashMap: " + map);

        // Accessing a value
        System.out.print("Enter a key to get its value: ");
        String keyToGet = scanner.nextLine();
        if (map.containsKey(keyToGet)) {
            System.out.println("Value for key '" + keyToGet + "': " + map.get(keyToGet));
        } else {
            System.out.println("Key not found");
        }

        // Removing an element
        System.out.print("Enter a key to remove: ");
        String keyToRemove = scanner.nextLine();
        map.remove(keyToRemove);
        System.out.println("After removing key '" + keyToRemove + "': " + map);

        // Size of the map
        System.out.println("Size of HashMap: " + map.size());

        // Iterating over the elements
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
