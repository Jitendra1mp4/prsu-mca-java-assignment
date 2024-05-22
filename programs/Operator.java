import myPack.Intro;
import static java.lang.System.* ;

public class Operator{
	public static void main(String args[]){
		Intro.print("Different kind of operators in JAVA") ;
		
		// Arithmetic Operators
		out.println("Arithmetic Operators") ;
		int a = 5 , b = 6 ;
		out.println(a + " + " + b +" = " + (a+b)) ;
		out.println(a + " - " + b +" = " + (a-b)) ;
		out.println(a + " * " + b +" = " + (a*b)) ;
		out.println(a + " / " + b +" = " + (a/b)) ;
		out.println(a + " % " + b +" = " + (a%b)) ;

        // Comparison Operators
		out.println("\nComparison Operators") ;
		out.println(a + " = " + b +" = " + (a=b)) ;
		out.println(a + " != " + b +" = " + (a!=b)) ;
		out.println(a + " < " + b +" = " + (a<b)) ;
		out.println(a + " > " + b +" = " + (a>b)) ;
		out.println(a + " <= " + b +" = " + (a<=b)) ;
		out.println(a + " >= " + b +" = " + (a>=b)) ;
		
		// Bitwise operators
		out.println("\nBitwise Operators") ;
		out.println(a + " & " + b +" = " + (a&b)) ;
		out.println(a + " | " + b +" = " + (a|b)) ;		
		out.println(a + " ^ " + b +" = " + (a^b)) ;
		out.println(a + " << " + b +" = " + (a<<b)) ;
		out.println(a + " >> " + b +" = " + (a>>b)) ;		
		out.println(" ~ " + b +" = " + (~b)) ;
		
		// Logical operators
		int d = 7 , e = 8 ;
		out.println("\nLogical Operators") ;
		out.println(a + " == " + b +" && " + d + " == " + e + " : " +( a==b && d==e)) ;
		out.println(a + " == " + b +" || " + d + " == " + e + " : " +( a==b || d==e)) ;
		out.println("!("+a + " == " + b +") : " + !( a==b)) ;
	}
}