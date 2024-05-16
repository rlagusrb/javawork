package _04_ex01;

public class T01_api_book {
	String bookName;
	int ISBN;
	int price;
	
	T01_api_book() {
		this("없음", 0, 0);
	}
	T01_api_book(String bookName) {
		this(bookName, 123, 10000);
	}
	T01_api_book(String bookName, int ISBN) {
		this(bookName, ISBN, 12000);
	}
	T01_api_book(String bookName, int ISBN, int price) {
		this.bookName = bookName;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	

}
