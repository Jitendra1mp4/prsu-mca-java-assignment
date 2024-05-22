package AnimalPack ;
public class Cat extends Animal{
	
	public Cat(String name , String breed){
		setName(name) ;
		setBreed(breed) ;
	}
	public void print(){
		System.out.println("Cat properties : ") ;
		System.out.println("name : " +name) ;
		System.out.println("breed : "+breed) ;
	}
}