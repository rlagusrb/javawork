package _02_car;

public class AmbulanceCar extends Car {
	boolean siren;

	AmbulanceCar(String model, String company, int speed, boolean power) {
		super(model, company, speed, power);		
	}
	void siren() {
		if(siren = !siren)
		System.out.println("삐용삐용~~~~");
		else
			System.out.println("사이렌을 멈춥니다");
	}
	void firstAd() {
		System.out.println("응급처치를 합니다.");
	}
	

}
