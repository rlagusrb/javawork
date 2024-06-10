package _03_calendar_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T04_date {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		//now.setYear(2025);
		
		//2024-05-27 17:18
		//MM : 월, mm:분
		//hh : 소문자면 12시간 제(0~11)
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf2.format(now));
		
		//맨뒤에 a:오전 오후
		//HH:대문자면 24시간 제(0~23)
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		System.out.println(sdf3.format(now));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf4.format(now));
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy/M/dd");
		System.out.println(sdf5.format(now));
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("MM-dd-yyyy");
		System.out.println(sdf6.format(now));
		
		SimpleDateFormat sdf7 = new SimpleDateFormat("yyyy년 MM월 dd월 E요일");
		System.out.println(sdf7.format(now));
		
		String str = "20240507";
		SimpleDateFormat sdf8 = new SimpleDateFormat("y yyy-MM-dd");
		SimpleDateFormat sdf9 = new SimpleDateFormat("yyyyMMdd");
		Date strNow;
		try {
			strNow = sdf8.parse(str);
			System.out.println(sdf9.format(strNow));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
