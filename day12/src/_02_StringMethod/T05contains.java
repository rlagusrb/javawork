package _02_StringMethod;

public class T05contains {

	public static void main(String[] args) {
		// contains : 문자열 안에 찾고하는 문자열이 포함되어 검사
		String str = "JSP 웹 프로그래밍";
		
		boolean result = str.contains("java");
		System.out.println(result);
		
		if(str.contains("웹"))
		System.out.println("웹페이지를 만드는 프로그램");
		else 
			System.out.println("기타 프로그램");
		

	}

}
