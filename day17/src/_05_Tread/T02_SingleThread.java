package _05_Tread;

import java.awt.Toolkit;

public class T02_SingleThread {
	public static void main(String[] args) {
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	for(int i=0; i<5; i++) {
		try {
			Thread.sleep(1000);
			toolkit.beep();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		toolkit.beep();
		System.out.println(i);
	}
	

}
} 
