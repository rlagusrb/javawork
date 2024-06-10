package _04_Enum;

import java.util.Calendar;

public class T02_EnumMonth {

	public static void main(String[] args) {
	Month today = null;
		
		Calendar cal2 = Calendar.getInstance();
		//요일 1~7
		int month = cal2.get(cal2.DAY_OF_MONTH);
		System.out.println(month);
		
		switch(month) {
		case 1:
			today = Month.JANUARY;
			break;
		case 2:
			today = Month.FEBRUARY;
			break;
		case 3:
			today = Month.MARCH;
			break;
		case 4:
			today = Month.APRIL;
		case 5:
			today = Month.MAY;
			break;
		case 6:
			today = Month.JUNE;
			break;
		case 7:
			today = Month.JULY;
		case 8:
			today = Month.AUGUST;
			break;
		case 9:
			today = Month.SEPTEMBER;
			break;
		case 10:
			today = Month.OCTOBER;
			break;
		case 11:
			today = Month.NOVEMBER;
			break;
		case 12:
			today = Month.DECEMBER;
		}
		if(today == Month.MAY)
			System.out.println("5월은 너무 너무 재수 좋은 달");
		else
			System.out.println("열심히 자바 공부를 한다");
	}

		

}


