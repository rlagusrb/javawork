package _06_ex;

public class Book {
	private String title;
	private String author;
	private String publisher;
	
	Book() {}
	Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		
	}
	void setTitle(String title) {
		this.title = title;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	void setPubliser(String publisher) {
		this.publisher = publisher;
	}
	String getTitle(String title) {
		return title;
	}
	String getAuthor(String author) {
		return author;
	}
	String getPubliser(String Publisher) {
		return publisher;
	}
	public String toString() {
		return "제목 : " + title + "저자 : " + author + "출판사 : " + publisher;
	}
	
	

}
