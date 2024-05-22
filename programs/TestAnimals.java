import myPack.Intro;
import AnimalPack.Dog ;
import AnimalPack.Cat ; // imported two classes from AnimalPack

public class TestAnimals{
  
  public static void main(String arg[]){
	  Intro.print("Package having two Classes") ;
	 
	  Dog dg = new Dog("Diggu", "Pug") ;
	  dg.print() ;
	  
	  System.out.println() ;
	  Cat ct = new Cat("Kittu", "Beagle") ;
	  ct.print() ;
  }
  
}