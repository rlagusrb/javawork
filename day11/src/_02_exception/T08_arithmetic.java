package _02_exception;

import java.util.Scanner;

public class T08_arithmetic {

	public static void main(String[] args) {
		// 사용자로부터 2수를 입력 받아 
		// 나눈 몫 출력
		// 나눈 나머지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나누기 할 정수 2개 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
		System.out.println("몫 : " + a/b);
		System.out.println("나머지 : " + a%b);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		}

	}

}
