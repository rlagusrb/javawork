package _07_polymorphismArray;

public class Buyer {
	int money = 500;
	int bonusPoint;
	Product[] cart = new Product[10];
	int index = 0;
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[index++] = p;
		System.out.println(p + "를 구입함");
	}
	void info() {
		int sum = 0;
		String list = "";
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null)
				break;
			sum += cart[i].price;
			list += cart[i] + ",";
		
		}
		System.out.println("구매한 물건의 가격 : " + sum + "만원");
		System.out.println("구입한 물건  : " + list);
	}

}
