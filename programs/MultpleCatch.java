import myPack.Intro;

public class MultpleCatch {
    public static void main(String args[]) {
        Intro.print("Multiple catch block in try catch statement");

        int arr[] = { 3, 4, 5, 7, 8 };
        float c = 0;
        try {
            c = arr[1] / (arr.length - 5);
            System.err.println("c= " + c);
            for (int i = 0; i <= 5; i++) {
                System.err.print(arr[i] + " ");
            }

        } catch (IndexOutOfBoundsException e) {
            System.err.println("\nException caught : ");
            e.printStackTrace();
        } catch (ArithmeticException ae) {
            System.err.println("\nException caught : ");
            ae.printStackTrace();
        } catch (Exception e) {
            System.err.println("\nException caught : ");
            e.printStackTrace();
        }

    }
}