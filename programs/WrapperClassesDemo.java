import myPack.Intro;
import java.util.Scanner;

public class WrapperClassesDemo {
    public static void main(String[] args) {
        Intro.print("Various Wrapper Classes");

        Scanner scanner = new Scanner(System.in);

        // Integer
        System.out.print("Enter an integer: ");
        int intInput = scanner.nextInt();
        Integer intObj = Integer.valueOf(intInput);
        System.out.println("Integer value: " + intObj);

        // Double
        System.out.print("Enter a double: ");
        double doubleInput = scanner.nextDouble();
        Double doubleObj = Double.valueOf(doubleInput);
        System.out.println("Double value: " + doubleObj);

        // Boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean boolInput = scanner.nextBoolean();
        Boolean boolObj = Boolean.valueOf(boolInput);
        System.out.println("Boolean value: " + boolObj);

        // Character
        System.out.print("Enter a character: ");
        char charInput = scanner.next().charAt(0);
        Character charObj = Character.valueOf(charInput);
        System.out.println("Character value: " + charObj);

        // Auto-boxing
        int primitiveInt = intObj;
        double primitiveDouble = doubleObj;
        boolean primitiveBool = boolObj;
        char primitiveChar = charObj;

        System.out.println("Unboxed values: " + primitiveInt + ", " + primitiveDouble + ", " + primitiveBool + ", " + primitiveChar);
    }
}
