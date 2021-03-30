package ex02;

import java.util.Scanner;

public class Quiz05_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===================================");
		System.out.println("1. 서울");
		System.out.println("2. 경기도");
		System.out.println("3. 충청도");
		System.out.println("4. 경상도");
		System.out.println("5. 전라도");
		System.out.println("6. 강원도");
		System.out.println("7. 제주도");
		//System.out.println("1.서울\n2. 경기도\n3. 충청도\n4. 경상도\n5. 전라도\n6. 강원도\n7. 강원도);
		//가능하다
			System.out.println("===================================");
			System.out.print("당신의 고향은 ?");
		int number = sc.nextInt();
			System.out.println("===================================");
		String con = new String();
		if(number >0 && number<8){ 
			if(number == 1) {
				con = "서울";
			}else if (number == 2) {
				con = "경기도";
			}else if (number == 3) {
				con = "충청도";
			}else if (number == 4) {
				con = "경상도";
			}else if (number == 5) {
				con = "전라도";
			}else if (number == 6) {
				con = "강원도";
			}else if (number == 7) {
				con = "제주도";
			}
			System.out.printf("당신의 고향은 %s입니다.\n",con);
		}else {
				System.out.println("잘못된 지역번호 입니다.");
			}
			
	}
}
