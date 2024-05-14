package _01_array;

import java.util.Arrays;
import java.util.Scanner;

public class T05_lotto {

	public static void main(String[] args) {
		// p122
		
		//1. 6개의 1차원 배열
		//2. 1~45숫자를 랜덤으로 추출해서 배열에 넣기
		//3. 배열에 있는 값과 랜덤 추출한값이 같은가 비교
		//4. 같은 값이면 다시 랜덤 추출
		//5. 다른면 배열에 넣기
		//6. 6개의 배열이 꽉 찰때까지 반복
		
		int lotto[] = new int [6];
		
		int index = 0;
		while(true) {
			int temp = (int)(Math.random()*45)+1;
			
			boolean insert = true; // 배열에 둘어값과 temp의 값이 다르면
			for(int i =0; i<=index; i++) {
				if(lotto[i] == temp) {
					insert = false; // 배열에 들어값과 temp의 값이 같으면
					break;
				}
			}
			if(insert) { //insert가 true이면 lotto배열에 temp값 넣기
				lotto[index] = temp;
				index++;
			}
			if(index == 6) // 배열이 6개가 꽉 차면 while 빠져나오기
				break;
			
		}
		System.out.println(Arrays.toString(lotto));
		
		//1. 길이 10인 배열을 선언하고 1~10까지 반복문을 이용하여 순서대로 넣고 출력하기
		int rlfdl[] = new int[10];
		for(int i=0; i<10; i++) {
			rlfdl[i] = i+1;
			System.out.print(rlfdl[i]);
		}
		System.out.println();
		//2.길이가 10인 배열을 선언하고 1~10까지 값을 반복문을 이용하여 역순으로 배열 인덱스 넣고 값 출력
		int rlfdl2[] = new int[10];
		for(int i=9; i>=0; i--) {
			rlfdl2[i] = i+1;
			System.out.print(rlfdl[i]);
		}
		System.out.println();
		//3.사용자로 부터 입력받은 수 만큼 배열을 만들고 1~입력받은 수를 차례대로 넣어 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 갯수 입력 : ");
		int a = sc.nextInt();
		int rlfdl3[] = new int[a];
		for(int i=0; i<rlfdl3.length; i++) {
			rlfdl3[i] = i+1;
			System.out.print(rlfdl3[i]);
		}
		System.out.println();
		
		//4.길이가 5일 베열에 사과 귤 포도 복숭아 참외로 초기화한후 배열 인덱스를 이용하여 귤 출력
		String rlfdl5[] = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(rlfdl5[1]);
		
		//5
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("찾을 문자 : ");
		char search = sc.next().charAt(0);
		char[] carr5 = new char[str.length()];
		int count5 = 0;
		String index1 = "";
		
		for(int i=0; i<str.length(); i++) {
			carr5[i] = str.charAt(i);
			if(carr5[i] == search) {
				index1 += i+ " ";
				count5++;
			}
		}
		System.out.println(str + "에" + search + "가 존재하는 위치(인덱스) :" + index1 );
		System.out.println(search + "개수 : " + count5);
		//6
		char[] days = {'월','화','수','목','금','토','일'};
		System.out.print("0~6사이 숫자 입력 :");
		int sarr6 = sc.nextInt();
		
		if(sarr6>=0 && sarr6<=6) {
			System.out.println(days[sarr6] + "요일");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		//7
		System.out.print("베열의 개수 입력 : ");
		int count = sc.nextInt();
		int[] sarr7 = new int[count];
		int sum = 0;
		for(int i=0; i<count; i++) {
			System.out.print(i+1 + "번쩨 값 : ");
			sarr7[i] = sc.nextInt();
			sum += sarr7[i];
		}
		System.out.println(Arrays.toString(sarr7));
		System.out.println("합계: " + sum);
			
		//8
		while(true) {
			System.out.println("정수 입력 :");
			int num1 = sc.nextInt();
			
			if(num1 >=3 && num1%2 ==1) {
				int iarr8[] = new int[num1];
				int value = 1;
				for(int i=0; i<iarr8.length; i++) {
					if(i<num1/2)
						iarr8[i] = value++;
					else 
						iarr8[i] = value--;
					System.out.println(iarr8[i]);
				}
				break;
			}else {
				System.out.println("다시 입력하세요");
		}
		}
		
		//9
		String[] chickens = {"양념", "후라이드", "파닭", "허니버터"};
		String menu = sc.next();
		
		boolean flag = false;
		for(int i=0; i<chickens.length; i++) {
			if(menu.equals(chickens[i])) {
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println(menu + "치킨 배달 가능");
		else
			System.out.println(menu + "치킨은 없는 메뉴입니다");
		System.out.println();
		//10
		int[] iarr10 = new int[10];
		for(int i =0; i<iarr10.length; i++) {
			iarr10[i] =(int)(Math.random()*10)+1;
			System.out.println(iarr10[i] + " ");
		}
		System.out.println();
		int min = iarr10[0];
		int max = iarr10[0];
		
		for(int i=1; i<iarr10.length; i++) {
			if(min >iarr10[i])
				min = iarr10[i];
			if(max <iarr10[i])
				max = iarr10[i];
		}
		System.out.println("최솟값은 :" + min);
		System.out.println("최대값은 :" + max);
				
		
		}

}
