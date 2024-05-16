package _04_ex01;

public class T01_main_book {

	public static void main(String[] args) {
		T01_api_book b1 = new T01_api_book();
		System.out.println(b1.bookName + ", " + b1.ISBN + ", " + b1.price);
		T01_api_book b2 = new T01_api_book("해리포터");
		System.out.println(b2.bookName + ", " + b2.ISBN + ", " + b2.price);
		T01_api_book b3 = new T01_api_book("마법천자문", 500);
		System.out.println(b3.bookName + ", " + b3.ISBN + ", " + b3.price);
		T01_api_book b4 = new T01_api_book("마법천자문", 500, 20000);
		System.out.println(b4.bookName + ", " + b4.ISBN + ", " + b4.price);
		
		
				

	}

}
