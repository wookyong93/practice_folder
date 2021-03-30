package ex03;

import java.util.Calendar;

public class Exam2 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		//System.out.println(now);
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1; // 월 0 ~ 11월 까지 있다 그래서 1을 더해 줘야 한다.
		System.out.println(month);
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = now.get(Calendar.DAY_OF_WEEK);// 0 은 일요일 ~ 6 은 토요일
		System.out.println(week);
		String weekend = null;
			switch(week) {
			case 1 : 
				weekend = "일요일";
				break;
			case 2 : 
				weekend = "월요일";
				break;
			case 3 : 
				weekend = "화요일";
				break;
			case 4 : 
				weekend = "수요일";
				break;
			case 5 : 
				weekend = "목요일";
				break;
			case 6 : 
				weekend = "금요일";
				break;
			case 7 : 
				weekend = "토요일";
				break;
			}
			System.out.println(weekend);
			
			int hour = now.get(Calendar.HOUR);
			System.out.println(hour);
			int minute = now.get(Calendar.MINUTE);
			System.out.println(minute);
			int second = now.get(Calendar.SECOND);
			System.out.println(second);
			int hour24 = now.get(Calendar.HOUR_OF_DAY);
			System.out.println(hour24);
			int am_pm = now.get(Calendar.AM_PM);
			System.out.println(am_pm); // 0은 AM 1은 PM
	}
}
