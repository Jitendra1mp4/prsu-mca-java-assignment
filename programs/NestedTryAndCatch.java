import myPack.Intro;

public class NestedTryAndCatch {
    public static void main(String args[]) {
        Intro.print("Nested Try catch statement");

        int arr[] = { 3, 4, 5, 7, 8 };

        try {
            for (int i = 0; i < 5; i++) {
                System.err.print(arr[i] + " ");
            }
            try {
                float div = arr[0] / (9 - 5 - 4);
                System.out.println("div : " + div);
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("\nException caught : ");
            e.printStackTrace();
        }

    }
}