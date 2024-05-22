import myPack.Intro;
import java.util.Scanner;

public class StringBufferDemo {
    public static void main(String[] args) {
        Intro.print("StringBuffer Class & its methods");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String initialString = scanner.nextLine();

        StringBuffer sb = new StringBuffer(initialString);
        System.out.println("Original StringBuffer: " + sb);

        // Append
        System.out.print("Enter a string to append: ");
        String appendString = scanner.nextLine();
        sb.append(appendString);
        System.out.println("After append: " + sb);

        // Insert
        System.out.print("Enter the position to insert: ");
        int insertPosition = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter a string to insert: ");
        String insertString = scanner.nextLine();
        if (insertPosition >= 0 && insertPosition <= sb.length()) {
            sb.insert(insertPosition, insertString);
            System.out.println("After insert: " + sb);
        } else {
            System.out.println("Invalid position");
        }

        // Replace
        System.out.print("Enter start index for replace: ");
        int replaceStart = scanner.nextInt();
        System.out.print("Enter end index for replace: ");
        int replaceEnd = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter a string for replacement: ");
        String replaceString = scanner.nextLine();
        if (replaceStart >= 0 && replaceEnd <= sb.length() && replaceStart < replaceEnd) {
            sb.replace(replaceStart, replaceEnd, replaceString);
            System.out.println("After replace: " + sb);
        } else {
            System.out.println("Invalid indices");
        }

        // Delete
        System.out.print("Enter start index for delete: ");
        int deleteStart = scanner.nextInt();
        System.out.print("Enter end index for delete: ");
        int deleteEnd = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (deleteStart >= 0 && deleteEnd <= sb.length() && deleteStart < deleteEnd) {
            sb.delete(deleteStart, deleteEnd);
            System.out.println("After delete: " + sb);
        } else {
            System.out.println("Invalid indices");
        }
        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Length
        System.out.println("Length: " + sb.length());
    }
}
