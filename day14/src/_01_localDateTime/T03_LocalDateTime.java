package _01_localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class T03_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime startDay = LocalDateTime.of(2024,5,7,10,0,0);
		LocalDateTime endDay = LocalDateTime.of(2024,11,25,18,30,0);
		
		System.out.println(startDay);
		DateTimeFormatter dfg = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		System.out.println("시작일 :" + startDay.format(dfg));
		System.out.println("종료일 :" + endDay.format(dfg));
		
		if(today.isBefore(endDay)) {
			System.out.println("수업 진행중");
		}else if(today.isAfter(endDay)) {
			System.out.println("종료한 수업 입니다");
		}else if(today.isEqual(endDay)) {
			System.out.println("오늘 종료하는날 입니다.");
		}
		
		Duration duration = Duration.between(today, endDay);
		System.out.println(duration.getSeconds());
		
		System.out.println("종료일까지 시간 : " + today.until(endDay,ChronoUnit.HOURS) + "시간 남음");
		System.out.println("종료일까지 시간 : " + today.until(endDay,ChronoUnit.MONTHS) + "개월 남음");
		System.out.println("종료일까지 시간 : " + today.until(endDay,ChronoUnit.DAYS) + "일 남음");
		
		
		
				
		

	}

}
