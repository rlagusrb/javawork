package _03_bank;

public class T01_main_bank {

	public static void main(String[] args) {
		T01_api_bank b1 = new T01_api_bank();
		b1.deposit(1000);
		System.out.println("잔액 : " +b1.getBalance());
		
		b1.witdraw(500);
		System.out.println("잔액 : " + b1.getBalance());
		
		b1.witdraw(100);
		System.out.println("잔액 : " + b1.getBalance());
		
		b1.witdraw(500);
		

	}

}
