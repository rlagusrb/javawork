package _01_polymorphosm;

public class PetRun {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.info();
		cat.sound();
		
		System.out.println("-------------------------------");
		Dog dog = new Dog();
		dog.info();
		dog.sound();
	
		
		System.out.println("--------------------------------------------");
		Frog frog  = new Frog();
		frog.info();
		frog.sound();
		

	}

}
