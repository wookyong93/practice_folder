package Quiz07;

import java.util.Scanner;

public class UserExam1 {
	public static void main(String[] args) {
		UserInfo[] ui = new UserInfo[5];//사용자 정보 5개 저장공간 생성
		Scanner sc = new Scanner(System.in);
		UserService1 us = new UserService1();
		int num=0;// 사용자 정보 입력 갯수 저장하는 변수 
		while(true) {
			int menu = us.menu(); // 메뉴가 가지고 온 값을 저장;
				switch (menu) {
				case 1 : //입력
					if(num == 5) {//num이 5가 된다는 것은 입력할 공간이 없다는 뜻.
						System.out.println("더 이상 저장할 수 없습니다.");
					}else {
						ui[num]=us.input(num);
						num++;//새로운 공간으로 저장할 수 있도록 인덱스 번호를 증가시켜준다.
					}
					break;
				case 2 : //검색
					boolean b1 = us.serch(ui, num);//사용자의 모든 정보, 입력된 갯수를 전달하여 검색을 하도록 한다.
					if(b1) {
						System.out.println("찾는 아이디가 없습니다.");
					}
					break;
				case 3 : //출력
					if(num == 0 ) {//입력된 정보가 없을 경우 쓸모없는 호출을 줄이는게 좋습니다.
						System.out.println("등록된 사용자가 없습니다.");
					}else {
						us.output(ui, num); // 사용자의 모든정보 , 입력된 갯수를 전달해서 모든 내용 출력
					}
					break;
				case 0 : 
					System.out.println("프로그램 종료");
					
					return;
				default : 
					System.out.println("없는 메뉴 입니다.");
						
				}
			}
		}
	}


