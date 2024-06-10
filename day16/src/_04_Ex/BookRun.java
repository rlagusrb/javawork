package _04_Ex;

import java.util.*;

public class BookRun {
	public BookController bc = new BookController();
	
	void insertBook(Book book) {
	bc.insertBook(book);
	System.out.println("책을 추가하였습니다.");
	}
	
	void listAll() {
		List<Book> list = bc.listAll();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("책 제목 : " + list.get(i).getTitle() + "책 저자 : " + list.get(i).getAuthor() + 
					"카테고리 :" + list.get(i).getCategory() + "가격 :" + list.get(i).getPrice());
		}
		if(list.size() == 0) {
			System.out.println("책이 없습니다");
		}
		
	}
	void searchBook(String title) {
		List<Book> list = bc.listAll();
		
		for(int i=0; i<list.size(); i++) {
			if(title.equals(list.get(i).getTitle())) {
				System.out.println("책 제목 : " + list.get(i).getTitle() + "책 저자 : " + list.get(i).getAuthor() + "책 카테고리 :" + list.get(i).getCategory()
						+ "책 가격 :" + list.get(i).getPrice());
				return;
			}
		}
		System.out.println("책은 존재하지 않습니다.");
		
	}
	
	void deleteBook(String title, String author) {
		List<Book> list = bc.listAll();
		boolean isFind = false;
		for(int i=0; i<list.size(); i++) {
			if(title.equals(list.get(i).getTitle()) && author.equals(list.get(i).getAuthor())){
				bc.deleteBook(title, author);
				System.out.println("해당 책을 삭제했습니다");
				isFind = true;
			}
		}
		if(!isFind)
			System.out.println("삭제할 도서를 찾지 못했습니다");
	}
	void ascBook() {
		bc.ascBook();
		System.out.println("정렬을 하였습니다");
	}
	
	

	public static void main(String[] args) {
		BookRun br = new BookRun();
		Scanner sc = new Scanner(System.in);
		boolean systemon = true;
		
		while(systemon) {
			System.out.println("선택해 주세요 :");
			System.out.println("1. 새 도서 추가 2.도서 천체 조회 3.도서 검색 조회 4.도서 삭제 5.도서명 오름차순 정렬 9. 종료 ");
			int order = sc.nextInt();
			String title;
			String author;
			String category;
			int price;
			
			switch(order) {
				case 1: 
					System.out.println("넣을 책 이름을 입력하세요 : ");
					title = sc.next();
					System.out.println("작가를 입력하세요 : ");
					author = sc.next();
					System.out.println("카테고리를 입력하세요 : ");
					category = sc.next();
					System.out.println("가격을 입력하세요 : ");
					price = sc.nextInt();
					Book book = new Book(title, author, category, price);
					br.insertBook(book);
					break;
				case 2:
					br.listAll();
					break;
				case 3:
					System.out.println("검색할 책 이름을 입력해 주세요 : ");
					title = sc.next();
					br.searchBook(title);
					break;
				case 4:
					System.out.println("삭제할 책이름을 입력해주세요 : ");
					title = sc.next();
					System.out.println("삭제할 책의 저자를 입력해주세요 :");
					author = sc.next();
					br.deleteBook(title, author);
					break;
				case 5:
					br.ascBook();
					break;
				case 9:
					System.out.println("종료합니다");
					systemon = false;
					break;
				
					
			}
			 
		}
		

	}

}
