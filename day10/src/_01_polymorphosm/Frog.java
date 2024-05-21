package _01_polymorphosm;

public class Frog extends Pet {
	Frog() {
		super("유리개구리" , "초록색", "정체를 모르겠음");
	}
	Frog(String kind, String color, String feature) {
		super(kind, color, feature);
		// TODO Auto-generated constructor stub
	} 
	@Override
	void sound() {
		System.out.println("개굴 개굴");
	}
	
	
	

}
