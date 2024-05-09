package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 7;
		// 삼항연산자 : 조건식 ? 조건이 참일때 실행 : 조건이 거짓일때 실행
		
		String re = num1 < num2 ?"num1의 숫자가 더 작다" :"num1의 숫자가 더 크다";
		System.out.println(re);
		System.out.println(num1 < num2 ?"num1의 숫자가 더 작다" :"num1의 숫자가 더 크다");
		
		// 숫자를 무조건 양수로 출력
		int num3 = -8;
		int re2 = num3 < 0 ? -num3 : num3;
		System.out.println(re2);
		System.out.println(num3 < 0 ? -num3 : num3);
		
		//사용자로부터 점수를 입력 받아서 80점이상이면 합격, 그렇제 않으면 불합격 출력
		Scanner sc = new Scanner(System.in);
 		System.out.print("점수를 입력하세요.");
 		int num4 = sc.nextInt();
 		System.out.println(num4 >=80 ? "합격" : "불합격" );
 		
 		String re3 = num4 >=90 ? "A" : (num4 >= 80 ? "B" : (num4 >= 70 ? "C" : (num4 >= 60 ? "D" : "F")));
 		System.out.println(re3);
 		
	}

}
