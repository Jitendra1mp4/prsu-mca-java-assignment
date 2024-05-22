import myPack.Intro;
import static java.lang.System.* ;

public class ForEachLoop{
	public static void main(String args[]){
		Intro.print("Demostration of for each loop") ;
		
		int arr[] = {12,34,56,7,87,98,9,45,43,3} ;
		
		out.println("Items of array are : ") ;
		//using for each loop to iterate over array elements and printing values
		for (int i : arr) out.print(i+" ") ;
		out.println();	
	}
}