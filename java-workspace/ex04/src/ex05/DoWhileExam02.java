package ex05;

import java.util.Scanner;

public class DoWhileExam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//오류 검출
//		int num;
		boolean f1 = false;
//		
//		 do {
//			 if(f1) { // 참의 값을 넣지않으면 이매시지 출력
//				 
//				 System.out.println("범위가 벗어났습니다.");
//			 }
//			 System.out.print("정수 입력[2~9] : ");
//			 num = sc.nextInt();
//			 f1 = true;// 웨일 의 조건이 참이 되므로 반복
//		 }while (num >9 || num<2);// 이 조건이맞으면 거짓이므로 반복 ; 맞지않음 참이므로 종료
//		 
//		 System.out.println("Hi");//참이면 출력이되고 끝난다.
		 
		 int password = 13799731;
		 int pass;
		 
		 do {
			 if(f1) {
				 System.out.println("비밀번호가 틀립니다.");
			 }
			 System.out.print("비밀번호 입력 : ");
			 pass = sc.nextInt();
			 f1 = true;
		 }while(pass != password);
		 System.out.println("로그인 성공");
		 
		
		 
//		 if(num >=2 && num<=9) {
//			 System.out.println("HI");
//		 }else {
//			 System.out.println("범위가 잘못 됏다.");
//		 }
//		 
	}
}
