package AnimalPack ;

public class Dog extends Animal{
	
	public Dog(String name , String breed){
			setName(name)  ;
			setBreed(breed) ;
	}
	
	public void print(){
		System.out.println("Dog properties : ") ;
		System.out.println("name : " +name) ;
		System.out.println("breed : "+breed) ;
	}
}
