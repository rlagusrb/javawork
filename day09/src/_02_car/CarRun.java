package _02_car;

public class CarRun {

	public static void main(String[] args) {
		AmbulanceCar car1 = new AmbulanceCar("현대", "병원", 0, true);
		car1.speedUp();
		car1.siren();
		car1.firstAd();
		car1.speedDown();
		car1.poweroff();
		

	}

}
