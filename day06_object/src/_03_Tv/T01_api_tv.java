package _03_Tv;

public class T01_api_tv {
	String company = "LG";
	String model = "울트라 FULL HD";
	int inch = 65;
	int volume;
	int channel = 1;
	boolean power;
	
	void power() {
		power = !power;
		if(power)
			System.out.println("tv를 켭니다.");
		else
			System.out.println("tv를 끕니다.");
	}
	
	int channelUp() {
		channel++;
		return channel;
	}
	int channelDown() {
		channel--;
		return channel;
	}
	int volume(int volumeInput) {
		volume = volumeInput;
		return volume;
	}
	

}
