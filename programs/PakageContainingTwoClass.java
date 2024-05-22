package AnimalPack1 ;

class Animal {
	String name, breed;

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
}

class Cat extends Animal {
	public Cat(String name, String breed) {
		setName(name);
		setBreed(breed);
	}

	public void print() {
		System.out.println("Cat properties : ");
		System.out.println("name : " + name);
		System.out.println("breed : " + breed);
	}
}

class Dog extends Animal {
	public Dog(String name, String breed) {
		setName(name);
		setBreed(breed);
	}

	public void print() {
		System.out.println("Dog properties : ");
		System.out.println("name : " + name);
		System.out.println("breed : " + breed);
	}
}
