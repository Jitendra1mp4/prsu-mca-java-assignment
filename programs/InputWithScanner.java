import myPack.Intro;
import static java.lang.System.* ;
import java.util.Scanner ;

public class InputWithScanner{
	public static void main(String args[]){
		Intro.print("Input using Scanner") ;
		
		// creating object 
		Scanner sc = new Scanner(System.in) ;
		
		float a ;
		String s ;
		
		// input number 
		out.print("Enter number: ") ;
		a = sc.nextFloat() ;
		sc.nextLine() ; // to escap line
		out.print("Enter string: ") ;
		s = sc.nextLine() ;
		sc.close() ;
		out.println("Number : " + a ) ;
		out.println("String : " + s )  ;
	}
}