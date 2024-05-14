package _01_conditional;

import java.util.Scanner;

public class T01_switch_case {

	public static void main(String[] args) {
		// switch_case
		/*int num1 = 2; //0~2만 들어있는 변수
		
		switch(num1) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
		}
		
		Scanner sc = new Scanner(System.in);
		/*System.out.print("숫자 입력(0~2 숫자만) : ");
		
		int num2 = sc.nextInt();
		
		switch(num2) {
		case 0:
			System.out.println("0을 입력함");
			break;
		case 1:
			System.out.println("1을 입력함");
			break;
		case 2:
			System.out.println("2를 입력함");
			break;
		default :
			System.out.println("잘못입력");
		}
		
		char ch = 'k'; // k, 1, p
		switch(ch) {
		case 'k' :
			System.out.println("김씨입니다");
			break;
		case '1':
			System.out.println("이씨입니다");
			break;
		case 'p':
			System.out.println("박씨입니다");
			break;
		default :
			System.out.println("성이 김, 이, 박이 아닙니다");
		}
		int month = 9;
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
		default:
			System.out.println("가을");*/
			}
		
		//문1 사용자로 부터 2수와 연산자를 입력받아 연산결과를 출력
	private void sysou() {
	Scanner sc = new Scanner(System.in);
		int a, b;
		char dustks;
		
			System.out.println("첫번째 숫자를 입력하세요 : ");
			int a = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요 : ");
			int b = sc.nextInt();
			System.out.println("연산자를 입력 :");
			char dustks = sc.next().charAt(0);
			switch(dustks) {
			case '+':
				System.out.println(a+b);
				break;
			case '-':
				System.out.println(a-b);
				break;
			case '/':
				System.out.println(a/b);
				break;
			case '*':
				System.out.println(a*b);
				
			}
			
		
					
			
		
		
	 
		
		
		
		
		
				
				

	}

}
