package ex03;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 계산기\n2. 메모장\n3. 지뢰찾기\n4. 캘린더");
		System.out.print("사용할 앱의 번호를 입력해주세요 : ");
		int num =sc.nextInt();
		//		if =실행에 필요한 조건이 조건인경우 
		//		switch=실행에 필요한 조건이 값인 경우
		String name =null;
		switch(num) {
			case 1 :
				name = "계산기";
				System.out.println("계산기를 실행합니다.");
				// 변수값을 만들어도 break를 나가면 값이 사라진다.
				break;
			case 2 : 
				name = "메모장";
				System.out.println("메모장을 실행합니다.");
				break;
			case 3 : 
				name = "지뢰찾기";
				System.out.println("지뢰찾기를 실행합니다.");
				break;
			case 4 : 
				name = "캘린더";
				System.out.println("캘린더를 실행합니다.");
			default :
				System.out.println("지정된 앱의 번호가 없습니다.");
			// default 는 case 값에 해당되는게 없는 경우의 값을 표출
			}
		System.out.printf("%s를 실행합니다.",name);
//			String menu = "";
//		if(num==1) {
//			menu = "계산기";
//		}else if (num ==2) {
//			menu = "메모장";
//		}else if (num ==3) {
//			menu = "지뢰찾기";
//		}else if (num ==4) {
//			menu = "캘린더";
//		}else {
//			System.out.println("잘못된 앱번호 입니다.");
//		}	
//		System.out.printf("%s를 실행합니다.",menu);
//	
	
	}

}
