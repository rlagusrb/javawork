package kr.co.tjeun.run;
import java.util.Scanner;

import kr.co.tjeun.domain.Book;
public class BookRun {

	public static void main(String[] args) {
		//1. 기본생성자로 객체를 생성하여 getter/setter메소드 값 초기화
		/*Book book = new Book();
		book.setTitle("java");
		book.setAuthor("김현규");
		book.setPrice(35000);
		book.setPublisher("tjeun");
		System.out.println(book.imformation());
		
		// 초기화 방법 2. 매개변수가 있는 생성자 이용
		Book book2 = new Book("springBoot", "이강도", 27000, "저강도");
		System.out.println(book2.imformation());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("타이틀: " );
		String title = sc.next();
		
		System.out.println("저자 : ");
		String author = sc.next();
		
		System.out.println("가격 : ");
		int price = sc.nextInt();
		
		System.out.println("출판사: ");
		String publisher = sc.next();
		
		System.out.println(); */
		
		//관리 해야 되는데 일반 변수 사용
		Book book1 = null;
		Book book2 = null;
		Book book3 = null;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++ ) {
			System.out.println(i+1 +"번쩨 도서 정보 입력");
			
			
			System.out.println("타이틀: " );
			String title = sc.next();
			
			System.out.println("저자 : ");
			String author = sc.next();
			
			System.out.println("가격 : ");
			int price = sc.nextInt();
			
			System.out.println("출판사: ");
			String publisher = sc.next();
			
			if(i ==0)
				book1 = new Book(title, author, price, publisher);
			else if(i ==1)
				book2 = new Book(title, author, price, publisher);
			else
				book3 = new Book(title, author, price, publisher);
		}
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println(book3.information());
		
		//도서 제목을 검색하는 서비스
		System.out.println("검색할 책 제목 :");
		String search = sc.next();
		if(book1.getTitle().equals(search)) {
			System.out.println(book1.information());
		}
		if(book2.getTitle().equals(search)) {
			System.out.println(book2.information());
		}
		if(book3.getTitle().equals(search)) {
			System.out.println(book3.information());
		}
		
		
		
		
		
		
		
		
	}
		
}
