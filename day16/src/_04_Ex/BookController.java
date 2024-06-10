package _04_Ex;

import java.util.*;

public class BookController {
	List<Book> list = new ArrayList<Book>();
	
	BookController(){
		list.add(new Book("해리포터", "아무개", "판타지", 10000));
		list.add(new Book("안녕하세요" , "홍길동" , "액션", 12000));
		
		}
	public void insertBook(Book book) {
		list.add(book);
	}
	public List<Book> listAll() {
		return list;
	}
	public Book searchBook(String title) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.get(i);
			}
		}
		return null;
	}
	
	public void deleteBook(String title, String author) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title) && list.get(i).getAuthor().equals(author)) {
				list.remove(i);
			}
		}
	}
	public void ascBook() {
		Collections.sort(list);
	}

}
