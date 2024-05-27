package _02_StringMethod;

public class T02_replace {

	public static void main(String[] args) {
		// replace : 글자 치환
		String str = "javaprogram jeava awsjava dajva";
		String newStr = str.replace("j", "자바");
		
		System.out.println(str);
		System.out.println(newStr);
		System.out.println("----------------------------");
		newStr = str.replace("java", "자바");
		System.out.println(newStr);
		
		newStr = str.replaceAll("java", "자바");
		System.out.println(newStr);
		
		
		

	}

}
