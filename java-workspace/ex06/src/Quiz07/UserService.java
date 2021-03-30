package Quiz07;

import java.util.Scanner;

public class UserService {
	Scanner sc= new Scanner(System.in);
	public int menu() {
		System.out.println("1. 사용자 입력\n2. 사용자 검색\n3. 사용자 정보 출력\n0. 프로그램 종료 ");
		System.out.print("메뉴선택 : ");
		int menu =sc.nextInt();
		return menu;
	}
	public UserInfo input(int count) {
		UserInfo ui= new UserInfo();
		System.out.print("등록할 사용자 이름 입력 : ");
		ui.setName(sc.next());
		System.out.print("등록할 아이디 입력 : ");
		ui.setId(sc.next());
		System.out.print("등록할 암호 입력 : ");
		ui.setPwd(sc.next());
		System.out.println("등록할 이메일 입력 : ");
		ui.setAdr(sc.next());
		return ui;
	}
	public boolean serch(UserInfo[] ui,int count) {
		System.out.print("검색할 사용자의 아이디 입력해 : ");
		String sid = sc.next();
		boolean b1 =true;
			for(int i =0; i<count;i++) {
				if(ui[i].getId().equals(sid)) {
					System.out.println("사용자 이름 : "+ui[i].getName());
					System.out.println("사용자 아이디 : "+ui[i].getId());
					System.out.println("사용자 암호 : "+ui[i].getPwd());
					System.out.println("사용자 이메일 : "+ui[i].getAdr());
					b1 = false;
				}
			}return b1;
	}
	public void output(UserInfo[] ui,int count) {
		for(int i = 0 ; i <count;i++) {
			System.out.println("사용자 이름 : "+ui[i].getName());
			System.out.println("사용자 아이디 : "+ui[i].getId());
			System.out.println("사용자 암호 : "+ui[i].getPwd());
			System.out.println("사용자 이메일 : "+ui[i].getAdr());
			System.out.println("=========================================");
		}
	
	}

}
