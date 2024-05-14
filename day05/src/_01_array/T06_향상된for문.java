package _01_array;

import java.util.Arrays;

public class T06_향상된for문 {

	public static void main(String[] args) {
		// 향상된 for문 배열에서만 사용가능
		//배열을 처음부터 끝까지 사용할 때
		int num[] = {1,2,3,4,5,};
		
		for(int result : num) {
			System.out.println(result);
		}
		String name[] = {"홍길동", "아무개", "김길동"};
		for(String result : name ) {
			System.out.println(result);
		}
		//배열의 단점: 배열의 크기가 넣을 값보다 크면 메모리가 낭비
		//          배열의 크기가 적을 경우 나중에 늘릴 수 없다
		
		//배열의 크기가 적을 경우 copy하여 만들어야 함
		int[] oldScore = {98,67,48,100,94};
		int[] newScore = 	new int[10];
		
		for(int i=0; i<oldScore.length; i++) {
			newScore[i] = oldScore[i];
		}
		newScore[5] = 57;
		System.out.println(Arrays.toString(newScore));
		// 라이브러리(api) : arraycopy(복사할배열, 복사할index번호,새배열,새배열의index번호(부터넣기),갯수)
		System.arraycopy(oldScore, 0, newScore, 6, 4);
		System.out.println(Arrays.toString(newScore));
		
		//3개를 넣을 수 있는 문자열 배열을 만들어서 값을 넣기 
		// 5개짜리 배열을 만들어서 복사하여 붙여넣기 (index 5번부터 2개만 넣기
		String num2[] = new String[3];
		num2[0] = "aa";
		num2[1] = "bb";
		num2[2] = "cc";
		String num3[] = new String[10];
		//라이브러리 사용
		//System.arraycopy(num2, 0, num3, 5, 2);
		
		//for문 사용
		/*for(int i=0; i<num2.length-1; i++) {
			num2[i+5] = num3[i];
		}*/
		
		//향상된 for문 사용
		int index = 5;
		for(String str : num2) {
			num3[index++] = str;
		}
		System.out.println(Arrays.toString(num3));
		
		//클래스:
		//1.main 클래스: main메소드가 들어있음. 실행용
		//2.라이브러리 클래스: 다른 클래스에서 보조로 사용할 목적으로 만듬 
						//객체를 생성해야 사용할수 있음
		
		//3.구성요소
		    //필드(변수):저장공간
		    //메소드:입력값을 받아서(없을 수도 있음) 프로그램을 실행하여 결과값을 반환해줌
		
		
		
		
				

	}

}
