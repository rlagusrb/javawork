package _06_ex;

public class BookRun {

	public static void main(String[] args) {
		
		LibaryController lc = new LibaryController(new Member("김현규", 25, "남"));
		lc.insertBook();
		System.out.println(lc.selectAll());

	}

}
