package kr.co.tjeun.run;

import java.util.Scanner;

import kr.co.tjeun.domain.Book;

public class BookArrayRun {

	public static void main(String[] args) {
		Book[] books = new Book [3];
		
		Scanner sc =  new Scanner(System.in);
		
		for(int i=0; i<books.length; i++) {
			System.out.println(i+1 + "번쩨 책 정보 입력");
			System.out.println("타이틀: " );
			String title = sc.next();
			
			System.out.println("저자 : ");
			String author = sc.next();
			
			System.out.println("가격 : ");
			int price = sc.nextInt();
			
			System.out.println("출판사: ");
			String publisher = sc.next();
			
			books[i] = new Book(title, author, price, publisher);
			System.out.println(books[i].information());
		}
		// 도서 제목으로 검색하는 서비스
		System.out.println("검색할 도서명 : ");
		String search = sc.next();
		for(int i=0; i<books.length; i++) {
			if(search.equals(books[i].getTitle()))
				System.out.println(books[i].information());
		}
		

	}

}
