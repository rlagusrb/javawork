package _01_langPackage;
class Card2 {
	String kind;
	int num;
	Card2() {
		this("HEART", 7);
	}
	Card2(String kind, int num) {
		this.kind = kind;
		this.num = num;
		}
	//toString 오버라이딩
	@Override
	public String toString() {
		return "" + kind + ", " + num;
	}
	
}

public class T06_getClass {

	public static void main(String[] args) {
		Card card1 = new Card("SPADE", 3);
		Class cardClass1 = card1.getClass();
		System.out.println(card1);
		System.out.println(cardClass1);
		System.out.println(card1.getClass().getName());

	}

}
