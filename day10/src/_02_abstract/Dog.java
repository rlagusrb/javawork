package _02_abstract;

public class Dog extends Pet {
	Dog() {
		super("포메" , "흰색", "지랄 맞음");
	}
	Dog(String kind, String color, String feature) {
		super(kind, color, feature);
		// TODO Auto-generated constructor stub
	} 
	@Override
	void sound() {
		System.out.println("멍 멍");
	}
	@Override
	void info() {
		// TODO Auto-generated method stub
		
	}
	
	

}
