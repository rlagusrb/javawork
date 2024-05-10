package _02_repetive;

import java.util.Scanner;

public class T06_ex01 {

	public static void main(String[] args) {
		// 주사위의 숫자 맞추기 게임
		
		// comdml tntwksms 1~6
		/*Scanner sc = new Scanner(System.in);
		
		int com = (int)(Math.random()*6)+1;
		int user;
		count = 0;
		do {
			System.err.println("주사위의 숫자를 맞춰보세요. :");
			user = sc.nextInt();
			
			if(com == user)
				System.out.println("축하합니다. 맞첬습니다.");
			else
				System.out.println("틀렸습니다. 다시 입력하세요");
		}while(com != user);
		System.out.println();*/
		
		/*int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%5==0)
				sum+=i;
		}System.out.println("5의 배수의 합계는 :" + sum);
			*/
		
		int evenSum = 0;
		int oddSum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				evenSum+=i;	
			}else {
				oddSum+=i;
			}
		}
		System.out.println("짝수의 합계는 :" + evenSum);
		System.out.println("홀수의 합계는 : "+ oddSum);

	}

}
