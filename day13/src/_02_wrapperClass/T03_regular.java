package _02_wrapperClass;

import java.util.regex.Pattern;

public class T03_regular {

	public static void main(String[] args) {
		String regExp = "(02||010)-\\d{3,4}-\\d{4}";
		String data = "032-234-6789";
		
		boolean result = Pattern.matches(regExp, data);
		if(result)
			System.out.println("정규식과 일치합니다.");
		else
			System.out.println("정규식과 일치하지 않습니다.");
		
		//이메일체크
		regExp = "^[a-zA-Z]+\\w+@\\w+.\\w+(\\.\\w+)";
		data = "hkkim030621@naver.com";
		
		result = Pattern.matches(regExp, data);
		if(result)
			System.out.println("정규식과 일치합니다.");
		else
			System.out.println("정규식과 일치하지 않습니다.");
		//앞에는 문자나 숫자 1개이상 @ 문자나숫자 . 문자
		//sample123@naver46.com
		//sample123@google.com
		//sample123@naver.or.kr
		

	}

}
