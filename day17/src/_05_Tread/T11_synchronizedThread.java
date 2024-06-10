package _05_Tread;
class Account {
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}
	
	void withraw(int money) {
		if(balance>= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= money;
		}
	}
}
class ThreadC implements Runnable {
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.getBalance() >= 0) {
			int money = ((int)(Math.random()*3)+1)*100;
			System.out.println("출금액 : " + money);
			acc.withraw(money);
			System.out.println();
			System.out.println("잔액 : " + acc.getBalance());
		}
	}
}

public class T11_synchronizedThread {

	public static void main(String[] args) {
		/*Thread t1 = new Thread(new ThreadC());
		Thread t2 = new Thread(new ThreadC());
		t1.start();
		t2.start();*/
		
		Runnable r = new ThreadC();
		new Thread(r).start();
		new Thread(r).start();

	}

}


		

