package ex02;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t메뉴 선택");
		System.out.println("======================");
		System.out.println("1. 한식");
		System.out.println("2. 중식");
		System.out.println("3. 일식");
		System.out.println("4. 양식");
		System.out.println("======================");
		System.out.print("좋아하는 음식은 ? ");
		int select= sc.nextInt();
		
		String meuname =new String();
		if (select == 1 ) {
			//System.out.println("좋아하는 음식은 한식입니다.");
			meuname = "한식";
		}else if(select == 2 ) {
			//System.out.println("좋아하는 음식은 중식입니다.");
			meuname = "중식";
		}else if (select == 3) {
			//System.out.println("좋아하는 음식은 일식입니다.");
			meuname = "일식";
		}else if (select == 4 ) {
			//System.out.println("좋아하는 음식은 양식입니다.");
			meuname = "양식";
		}else {
			System.out.println("선택하신 번호의 메뉴는 없습니다.");
		}
		if(select >0 && select<=4) {
			System.out.println("좋아하는 음식은 "+meuname+" 입니다.");
			//ex)이런 방법도 있다
		} 
	}
}
