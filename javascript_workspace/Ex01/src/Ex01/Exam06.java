package Ex01;

import java.util.Scanner;



public class Exam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력 2.출력 3. 종료");
		int menu =sc.nextInt();
		
		switch(menu){
			case 1 :
				System.out.println("입력");
				break;
			case 2 : 
				System.out.println("출력");
				break;
			case 3 : 
				System.out.println("종료");
				break;
			default :
				System.out.println("메뉴 없음");
		}
		
	}
}
