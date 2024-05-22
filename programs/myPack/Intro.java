package myPack ;
public class Intro{
	public static void print(String topic){
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~") ;
		 System.out.println("Author : Jitendra Kumar SAHU");
	     System.out.println("Program Topic : "+ topic);
	     System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n") ;
	}
	public Intro(){}
	public Intro(String topic){
		print(topic);
	}
}