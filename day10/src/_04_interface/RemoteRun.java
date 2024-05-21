package _04_interface;

public class RemoteRun {

	public static void main(String[] args) {
		// 인터페이스는 객체생성할 수 없다
		// 그러나 형변환은 가능
		
		//new RemteControl rc1 = new RemoteControl();
		Audio audio1 = new Audio();
		audio1.turnOn();
		audio1.turnOff();
		
		RemoteControl rc = audio1;
		rc.turnOn();
		rc.turnOff();

	}

}
