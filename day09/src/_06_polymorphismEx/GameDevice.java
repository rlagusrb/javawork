package _06_polymorphismEx;

public class GameDevice extends Product {
	GameDevice() {
		super(100);
	}
	@Override
	public String toString( ) {
		return "GameDevice";
	}

}
