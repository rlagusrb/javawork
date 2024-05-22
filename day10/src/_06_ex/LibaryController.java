package _06_ex;

import java.util.ArrayList;

public class LibaryController {
	Member member;
	ArrayList<Book> aList = new ArrayList<Book>();
	
	LibaryController(Member m) {
	member = m;	
	}
	void info(){
		System.out.println(member);
	}
	void insertBook() {
		aList.add(new Book("java", "서민구", "김앤북"));
		aList.add(new Book("spring", "강민구", "한빛미디어"));
		aList.add(new Book("htm1", "이민구", "길벗"));
		
	}
	void insertBook(Book book) {
		aList.add(book);
	}
	ArrayList<Book> selectAll() {
		return aList;
	}
	Book searchBook(String bookTitle) {
		Book book = null;
		for(int i=0; i< aList.size(); i++) {
			if(aList.isEmpty()) {
				System.out.println("책이 없습니다");
				break;
			}
			if(bookTitle.equals(aList.get(i).getTitle())) {
				book = aList.get(i);
				break;
			}
		}
		return book;
	}
	 
	
	
	

}
	