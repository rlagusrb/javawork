package _02_abstract;

public class Cat extends Pet {

	Cat() {
		super("페르시안" , "갈색", "싸기지 없음");
	}
	Cat(String kind, String color , String feature) {
		super(kind, color, feature);
		// TODO Auto-generated constructor stub
	} 
	@Override
	void sound() {
		System.out.println("냐옹 냐옹");
	}
	@Override
	void info() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
