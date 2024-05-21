package _01_polymorphosm;

public class Pet {
	private String kind;
	private String color;
	private String feature;
	Pet(String kind, String color, String feature) {
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	
	void sound() {
		
	}
	
	
	String getKind() {
		return kind;
	}
	
	String getcolor() {
		return color;
	}
	
	@Override
	public String toString() {
		return"종류 ::" + kind + "색상 : " + color + "성격 : " + feature;
	}
	public void info() {
		System.out.println(this);	
		
	}

}
