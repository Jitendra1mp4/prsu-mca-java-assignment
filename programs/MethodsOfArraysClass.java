import myPack.Intro;
import java.util.Arrays ;

public class MethodsOfArraysClass{
	public static void main(String args[]){
        Intro.print("Methods of Arrays Class");

        // Demonstrating some methods of Arrays class
        int[] numbers = {5, 3, 8, 2, 9};
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Index of 8: " + Arrays.binarySearch(numbers, 8));

        // Additional functions
        int[] copiedArray = Arrays.copyOf(numbers, 3);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled array: " + Arrays.toString(filledArray));
    }
}
