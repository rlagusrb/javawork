package _02_car;

public class Car {
	String model;
	String company;
	int speed;
	boolean power;
	
	Car(String model, String company, int speed, boolean power) {
		this.model = model;
		this.company = company;
		this.speed = speed;
		this.power = power;
	}
	void powerOn() {
		System.out.println("시동을 킵니다.");
		power = true;
	}
	void speedUp() {
		speed += 10;
		System.out.println("속도를 올립니다.");
		
	}
	void speedDown() {
		speed -= 10;
		System.out.println("속도를 내립니다.");
		
	}
	void poweroff( ) {
		System.out.println("시동을 끕니다");
		power = false;
	}
		
	

}
