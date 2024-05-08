package _01_casting;

import java.util.Scanner;

public class T04_go {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 1개를 입력하세요. :");
		 char ch1 = sc.next().charAt(0);
		 // String ch1 = sc.next();
		 System.out.println((int)ch1);
		 
			int lang;
			int Eng;
			int math;
			int sum;
			float vudrbs;
			
			
			System.out.print("국어 점수를 입력하세요 : ");
			lang = sc.nextInt();
			System.out.print("영어 점수를 입력하세요 : ");
			Eng = sc.nextInt();
			System.out.print("수학 점수를 입력하세요 : ");
			math = sc.nextInt();
			
			sum = lang + Eng + math;
			vudrbs = (float)sum/3;
			
			System.out.println("총합은 : "+ sum);
			System.out.printf("평균%.2f\n", vudrbs);
			*/
			
			int iNum1 = 10;
		    int iNum2 = 4;
		    float fNum = 3.0f;
		    double dNum = 2.5;
		    char ch = 'K'; 
		    System.out.println(iNum1 / iNum2);
		    
		    double result = iNum2 * dNum;
		    System.out.println(result);
		    
		    System.out.println((double)iNum1);
		    
		    System.out.println((double)iNum1 / iNum2);
		    
		    int re = iNum1 / (int)fNum;
		    System.out.println(re);
		    
		    System.out.printf("%.13f\n", iNum1 / fNum);
		    
		    int result2 = ch;
		    System.out.println(result2);
		    
		    char result3 = (char)(ch + 1);
		    System.out.println(result3);
		    
		    
		    
		  
			
	}

}
