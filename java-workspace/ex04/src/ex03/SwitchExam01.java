package ex03;

import java.util.Scanner;

public class SwitchExam01 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int date =sc.nextInt();
		if(1<=date && 31<=date) {
			switch(date%7) {
			//사칙연산 값은 들어가지만 조건은 들어갈수없다.
			case 1 :
				System.out.println("월요일");
				break;
			case 2 : 
				System.out.println("화요일");
				break;
			case 3 : 
				System.out.println("수요일");
				break;
			case 4 :
				System.out.println("목요일");
				break;
			case 5 : 
				System.out.println("금요일");
				break;
			case 6 :
				System.out.println("토요일");
				break;
			case 0 : 
				System.out.println("일요일");
			}
		}else {
			System.out.println("없는 날짜 입니다.");
		}
	}
}
