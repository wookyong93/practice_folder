package ex03;

import java.util.Calendar;

public class Exam2 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		//System.out.println(now);
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1; // �� 0 ~ 11�� ���� �ִ� �׷��� 1�� ���� ��� �Ѵ�.
		System.out.println(month);
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = now.get(Calendar.DAY_OF_WEEK);// 0 �� �Ͽ��� ~ 6 �� �����
		System.out.println(week);
		String weekend = null;
			switch(week) {
			case 1 : 
				weekend = "�Ͽ���";
				break;
			case 2 : 
				weekend = "������";
				break;
			case 3 : 
				weekend = "ȭ����";
				break;
			case 4 : 
				weekend = "������";
				break;
			case 5 : 
				weekend = "�����";
				break;
			case 6 : 
				weekend = "�ݿ���";
				break;
			case 7 : 
				weekend = "�����";
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
			System.out.println(am_pm); // 0�� AM 1�� PM
	}
}
