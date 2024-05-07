package _03_Scanner;

import java.util.Scanner;

public class T02_Ex01 {

	public static void main(String[] args) {
		// 국어, 컴퓨터, 수학 점수를 입력받아 저장하고
		//총점과 평균을 출력하세요
		
		int lang;
		int computer;
		int math;
		int sum;
		float vudrbs;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		lang = sc.nextInt();
		System.out.print("컴퓨터 점수를 입력하세요 : ");
		computer = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		math = sc.nextInt();
		
		sum = lang + computer + math;
		vudrbs = (float)sum/3;
		
		System.out.println("총합은 : "+ sum + "평균은 : " +vudrbs);
		
		 

	}

}
