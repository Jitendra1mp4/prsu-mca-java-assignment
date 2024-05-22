import myPack.Intro;

public class LocalClassDemo {
    public static void main(String[] args) {
        Intro.print("Concept of Local Class");

        // Calling method with local class
        displayMessage();
    }

    static void displayMessage() {
        System.out.println("Inside method");

        // Local class definition
        class Local {
            void localMethod() {
                System.out.println("Inside local method");
            }
        }

        // Creating object of Local class
        Local local = new Local();
        local.localMethod();
    }
}
