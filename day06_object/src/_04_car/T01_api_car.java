package _04_car;

public class T01_api_car {
	String company = "KlA";
	String model = "k9";
	String color = "빨강";
	int speed;
	boolean power;
	
	void power() {
		power = !power;
		if(power)
			System.out.println("시동을 겁니다.");
		else
			System.out.println("시동을 끕니다.");
	}
	int speedUp() {
		speed += 10;
		return speed;
	}
	int speedDown() {
		speed -= 10;
		return speed;
	}

}
