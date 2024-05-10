package _02_repetive;

import java.util.Scanner;

public class T02_overlap_for {

	public static void main(String[] args) {
		for(int i=1; i<=3; i++) {
			for(int j=1;j<=5; j++) {
				System.out.println("i=" + i + ",j=" + j);
			}
		}
		// 구구단 
		/*2*1=2
		 * 2*2=4
		 * 
		 */
	/*	for(int dan=2; dan<=9; dan++) {
			System.out.println("*******" + dan+"단********");
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
			}*/
			
			// 사용자로 부터 숫자를 입력받아 별 출력
			Scanner sc = new Scanner(System.in);
			/*System.out.println("숫자를 입력하세요");
			int re1 = sc.nextInt();
			
			for(int i=1; i<=re1; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}*/
			
			System.out.println("2단\t 3단\t 4단\t 5단\t 6단\t 7단\t 8단\t 9단\t");
			for(int i=1; i<=9; i++) {
				for(int j=2; j<=9; j++) {
					System.out.print(j + "*" + i + "=" + i*j+ "\t");
				}
				System.out.println();
			}
			
		}

	}


