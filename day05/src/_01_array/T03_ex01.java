package _01_array;

import java.util.Scanner;

public class T03_ex01 {

	public static void main(String[] args) {
		// 사용자로부터 3사람의 국어, 수학, 컴퓨터 점수 입력
		Scanner sc = new Scanner(System.in);
		int score[][] = new int[3][3];
		for(int i=0; i<3; i++) {
			System.out.print(i+1 + ".번째의 국어, 수학, 컴퓨터의 점수입력 : ");
			for(int j=0; j<3; j++) {
				score[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("번호\t국어\t수학\t컴퓨터\t총점\t평균");
		System.out.println("---------------------------------------------------------------");
		for(int i=0; i<3; i++) {
			System.out.print(i+1 + "\t");
			int sum = 0;
			for(int j=0; j<3; j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];
			}
			System.out.print(sum+ "\t");
			System.out.printf("%.2f\n", (double)sum/3);
		}
		
			
	}
			

}
