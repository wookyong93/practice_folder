package ex01;

public class quiz04 {
	public static void main(String[] args) {
		int date = 12;
		//월 = 1,8,15,22,29
		//화 = 2,9,16,23,30
		//수 = 3,10,17,24
		//목 = 4,11,18,25
		//금 = 5,12,19,26
		//토 = 6,13,20,27
		//일 = 7,14,21,28
		if (date%7 ==0) {
			System.out.println("오늘은 일요일 입니다.");
		}else if (date%6 ==0 ) {
			System.out.println("오늘은 토요일 입니다.");
		}else if (date%5 ==0) {
			System.out.println("오늘은 금요일 입니다.");
		}else if (date%4 ==0) {
			System.out.println("오늘은 목요일 입니다.");
		}else if (date%3 ==0) {
			System.out.println("오늘은 수요일 입니다.");
		}else if (date%2 ==0) {
			System.out.println("오늘은 화요일 입니다.");
		}else {
			System.out.println("오늘은 월요일 입니다.");
		}
		//내가쓴답 오답~
		if (date%7==0) {
			System.out.println(date+"일은 일요일입니다.");
		}else if (date%7 ==1) {
			System.out.println(date+"일은 월요일입니다.");
		}else if (date%7 ==2) {
			System.out.println(date+"일은 화요일입니다.");
		}else if (date%7 ==3) {
			System.out.println(date+"일은 수요일입니다.");
		}else if (date%7 ==4) {
			System.out.println(date+"일은 목요일입니다.");
		}else if (date%7 ==5) {
			System.out.println(date+"일은 금요일입니다.");
		}else if (date%7 ==6) {
			System.out.println(date+"일은 토요일입니다.");
		}
		//정답 문 
		
	}
}
