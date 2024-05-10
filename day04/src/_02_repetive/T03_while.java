package _02_repetive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		/* while(조건식) {
		 *   조건식이 참일 때 수행
		 *   }
		 */
		/*for(int i=1; i<3; i++) {
			System.out.println(i);
		}
		*/
		int i = 1; // 초기식
		while(i<=3) { // 조건
			System.out.println(i); //실행
			i++; //증감식
		}
		
		int sum = 0;
		for(int j =1; j<=100; j++) {
			sum+=j;
		}

		
		int sum1 = 0;
		int y = 1;
		while(y<=100) {
			sum1+=y;
			y++;
			
			// sum += y++
		}
		System.out.println("1부터 100까지 합 :" + sum);
		
		int x = 10;
		
		while(x-- !=0) {
			System.out.println(x);
		}
		System.out.println("----------------------------------------------");
		//break : 반복문을 빠져 나온다
		int count = 0;
		while(true) {
			System.out.println(++count);
			if(count == 5) {
				break;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		/*while(true) {
			System.out.println("멈추려면 'q' 넣으세요 :");
			char ch = sc.next().charAt(0);
			
			if(ch == 'q')
				break;
		}
		System.out.println("프로그램이 종료되었습니다.");*/
		
		//문1. 사용자로부터 연산할 2숫자와 연산자를 입력받아 그 결과를 출력
		//     연산자에 @ 멈추고 그렇지 않으면 계속 입력받아 결과 출력
		
		
		
		
		/*while(true) {
			System.out.println("사용자로부터 연산할 2숫자와 연산자 입력: ");
			char op = sc.next().charAt(0);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(op == '@')
				break;
			
			switch(op) {
				case '+':
					System.out.println(a+ "" + op+b + "=" +(a+b));
					break;
				case '*':
					System.out.println(a+""+ op+b + "=" +(a*b));
					break;
				
					
		}
		}
		System.out.println("프로그램을 종료합니다.");*/
	}

}
