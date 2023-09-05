package etc.api.util;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
	
		Date date = new Date();
		System.out.println(date);
		
		System.out.println("===================");
		
		
		//현재 날짜 정보 얻기(연, 월, 일)
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		// 현재 시간 정보 얻기 (시, 분, 초)
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
		//현재 날짜와 시간 정보 얻기 (연, 월, 일, 시 , 분, 초)
		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println(localdatetime);
		
		//특정 날짜와 시간 정보 얻기
		LocalDateTime beginDate = LocalDateTime.of(2022, 7,1,9,0,0);
		System.out.println("beginDate: " + beginDate);
		
		//연, 월, 일 따로 추출
		int year = localdatetime.getYear();
		System.out.println("year: " + year);
		
		//정수 형태의 월 추출
		int monthValue = localdatetime.getMonthValue();
		System.out.println("monthValue: " + monthValue);
		//문자 형태의 월 추출 (Momth라는 열거형 타입 중 하나)
		Month month = localdatetime.getMonth();
		System.out.println("month : " + month);
		
		
		int dayValue = localdatetime.getDayOfYear();
		System.out.println("dayValue : " + dayValue);
		
		
		//요일 (열거형 타입 리턴)
		DayOfWeek dayofweek = localdatetime.getDayOfWeek();
		System.out.println("dayValue : " + dayofweek);
		
		System.out.println("=====================");
		
		
		//지금으로부터 3일 뒤 날짜 정보
		LocalDateTime returnDate = localdatetime.plusDays(3);
		System.out.println(returnDate);
		
		//지금으로부터 1년 2개월 7일 뒤
		LocalDateTime d1 = localdatetime
									.plusYears(1)
									.plusMonths(2)
									.plusDays(7);
		
		System.out.println(d1);
		
		//지금으로부터 9개월 23일전
		LocalDateTime d2 = localdatetime
							.minusMonths(9)
							.minusDays(23);
		System.out.println(d2);
		
		//사이 날짜 연산
		LocalDate b = LocalDate.of(2020, 12, 30);
		LocalDate f = LocalDate.of(2022, 9, 14);
		
		//b와 f사이 몇주가 지냤나
		long between = ChronoUnit.WEEKS.between(b, f);
		System.out.println("between: " + between);
		
		System.out.println("=================");
		//날짜 포맷 변경하기
		System.out.println(localdatetime);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		
		System.out.println(localdatetime.format(dtf));
	}

}
