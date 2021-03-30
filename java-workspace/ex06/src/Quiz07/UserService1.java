package Quiz07;

import java.util.Scanner;

public class UserService1 {
	Scanner sc = new Scanner(System.in);//입력을 도와주는 객체
	public int menu() {// 메뉴선택을 해서 선택된 번호를 exam으로 리턴해준다.
		
		System.out.println("1. 입력\n2. 검색\n3. 출력\n0. 종료"); // 메뉴 출력 
		System.out.print("메뉴 선택 : ");// 메뉴선택 출력
		int menu =sc.nextInt();//메뉴번호를 입력
		return menu;//메뉴번호를  menu()호출한 exam으로 리턴
	}
	public UserInfo input(int num) {//입력된 사용자정보를 exam으로 리턴해준다.
		UserInfo  ui = new UserInfo();
		System.out.print("사용자 이름 입력 : ");
		ui.setName(sc.next());
		System.out.print("사용자 아이디 입력 : ");
		ui.setId(sc.next());
		System.out.print("사용자 암호 입력 : ");
		ui.setPwd(sc.next());
		System.out.print("사용자 이메일 입력 : ");
		ui.setAdr(sc.next());
		
		return ui; //입력 된 모든 정보를 가진 UserInfo의 객체를 exam 에 전달한다.
	}
	public boolean serch(UserInfo[] ui,int num) {//사용자 모든정보 , 입력갯수를 받아서 검색한다.
		System.out.print("검색할 아이디 입력 : ");
		String sid  = sc.next();
		
			for(int i =0 ; i<num;i++) {
				if(ui[i].getId().equals(sid)) {// 검색한 아이디가 있을 경우 
					System.out.println("이름 : "+ui[i].getName());
					System.out.println("아이디 : "+ui[i].getId());
					System.out.println("암호 : "+ui[i].getPwd());
					System.out.println("이메일 : "+ui[i].getAdr());
					return false;
					}
			}
			return true; // 검색한 아이디가 없을 경우 
	}
	public void output(UserInfo[] ui,int num) {//void 는 전송할꼐없는경우에 사용 // 모든 사용자정보와 입력갯수를 이용해서 모든 내용 출력;
		for(int i = 0;i<num;i++) {
			System.out.println("사용자 이름 : "+ui[i].getName());
			System.out.println("사용자 아이디 : "+ui[i].getId());
			System.out.println("사용자 암호 : "+ui[i].getPwd());
			System.out.println("사용자 이메일 : "+ui[i].getAdr());
			System.out.println("================================");
		}
	}
}
