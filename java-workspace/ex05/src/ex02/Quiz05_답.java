package ex02;

import java.util.Scanner;

public class Quiz05_답 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//방의 총 갯수
		System.out.print("호텔의 총 방의 갯수 입력 : ");
		int room = sc.nextInt();// 방의 총 숫자 입력
		
		//방의 상태를 가지고 있는 배열 생성 -boolean 배열 (true/false)
		boolean[] roomNum = new boolean[room]; // 방의 총 숫자만큼 배열 생성
		int num=0; // 입력된 방번호 저장하는 변수
		main : while(true) {
			System.out.println("호텔 관리 프로그램");
			System.out.println("1. 입실\n2. 퇴실\n3. 전체 정보\n0. 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
				case 1:
					System.out.println("입실할 방번호 입력 [1~"+room+"] : ");
					 num = sc.nextInt() - 1; // 방번호 입력 : 인덱스 번호로 처리 위해 -1
					if(roomNum[num]==true) { // 방상태 확인
						System.out.println("현재 사용중으로 입실 할수 없습니다..");
						//현재 입실중인방
					}else {
						roomNum[num] = true;//입실처리
						System.out.println("입실 처리가 완료 되었습니다.");
					}
					break;
				case 2:
					System.out.println("입실할 방번호 입력 [1~"+room+"] : ");
					 num = sc.nextInt() - 1;
					if(roomNum[num]==true) {//방상태 확인
						
						System.out.println("퇴실처리가 완료 되었습니다.");
						//퇴실처리
						roomNum[num] = false;
					}else {
						
						System.out.println("현재 비어있는 방이므로 퇴실할 수 없습니다.");
						//현재 비어있는방
					}
					break;
				case 3:
					for(int i =0 ; i<room; i++) {//0번 인덱스 부터 전체 방 상태 확인
						if(roomNum[i] == true) {//입실
							System.out.println((i+1)+"번방은 사용중 입니다.");
						}else {//비어있는방
							System.out.println((i+1)+"번방은 비어있습니다.");
						}
					}
					break;
				case 0:
					System.out.println("프로그램 종료");
					break main;
				default:
						System.out.println("선택한 메뉴가 없습니다.");
			}
			
		}
		
		
		
	}
}
