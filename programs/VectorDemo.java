import myPack.Intro;
import java.util.Vector;
import java.util.Scanner;

public class VectorDemo {
    public static void main(String[] args) {
        Intro.print("Vector class demonstration");

        Vector<String> vector = new Vector<>();
        Scanner scanner = new Scanner(System.in);
         System.out.println("Menu:");
            System.out.println("1. Add element");
            System.out.println("2. Display elements");
            System.out.println("3. Exit");
        while (true) {
           
            System.out.print(">> ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    String element = scanner.nextLine();
                    vector.add(element);
                    break;
                case 2:
                    System.out.println("Vector Elements:");
                    for (String elem : vector) {
                        System.out.println(elem);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
