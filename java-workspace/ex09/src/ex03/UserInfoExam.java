package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInfoExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User u = new User();
		List<User> list = new ArrayList<>();
		UserInfo ui = new UserInfoImpl();
		while(true) {
			System.out.println("1. 등록 2. 출력 0. 종료");
			System.out.println("메뉴선택 : ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1 :
				ui.input();
				break;
			case 2 : 
				ui.output();
				break;
			case 0 : 
				return;
				default :
					System.out.println("없는 메뉴입니다.");
			}
	}
	}
}
