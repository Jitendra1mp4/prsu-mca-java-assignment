import myPack.Intro;

public class StringClassAndMethod {
    public static void main(String[] args) {
        Intro.print("The String Class & its methods");

        String str = "Hello, World!";
        System.out.println("Original String: " + str);

        // Length of the string
        System.out.println("Length: " + str.length());

        // Character at a specific index
        System.out.println("Character at index 7: " + str.charAt(7));

        // Substring
        System.out.println("Substring (7, 12): " + str.substring(7, 12));

        // Replace
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced String: " + replacedStr);

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Convert to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // Check if string contains a sequence
        System.out.println("Contains 'Hello': " + str.contains("Hello"));
    }
}
