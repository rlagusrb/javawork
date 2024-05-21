package _03_abstract;

public abstract class Phone {
	String owner;
	
	Phone(String owner) {
		this.owner =owner;
	}
	
	abstract void turnOn();
	abstract void turnOff();

}
