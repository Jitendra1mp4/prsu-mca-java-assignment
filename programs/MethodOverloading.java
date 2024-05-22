import myPack.Intro;
class Adder {

	void printSum(int a, int b){
		System.out.println("sum = "+ (a+b));
	}

	void printSum(int a, int b, int c){
		System.out.println("sum = "+ (a+b+c));
	}
	void printSum(float a, float b){
		System.out.println("sum = "+ (a+b));
	}
	
}


public class MethodOverloading{
	public static void main(String args[]){
		Intro.print("Demonstration of method overloading") ;
			
		Adder a = new Adder() ;
		a.printSum(3, 5);
		a.printSum(5.2f, 6.3f);
		a.printSum(2, 3,6);
	}
}