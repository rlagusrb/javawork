package _03_Scanner;

import java.util.Scanner;

public class T01_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next(); //문자열의 단어
		System.out.println("당신의 이름은 "+ name);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("당신의 나이 : " + age);
		
		System.out.print("키를 입력하세요 : ");
		double key = sc.nextDouble();
		System.out.println("키 : " + key);
		
		System.out.print("당신은 남자입니까 : ");
		boolean gender = sc.nextBoolean();
		System.out.println("당신은 남자입니까?" + gender);
		
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		System.out.println("주소 : " + address);
		
		
		

	}

}
