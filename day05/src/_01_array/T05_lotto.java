package _01_array;

import java.util.Arrays;

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
			if(insert) { //insert가 true이면 lotto배열에 ㅅ그ㅔrkqt sjgrl
				lotto[index] = temp;
				index++;
			}
			if(index == 6) // 배열이 6개가 꽉 차면
				break;
			
		}
		System.out.println(Arrays.toString(lotto));
		}

}
