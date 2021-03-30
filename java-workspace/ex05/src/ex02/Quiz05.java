package ex02;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("방의 수를 설정해주세요 : ");
		int count = sc.nextInt();
		int roomnum = 0 ;
		String o1 = null;
		boolean[] room = new boolean[count];
		
			while(true){
			System.out.println("1. 입실\n2. 퇴실\n3. 방전체정보\n0. 프로그램 종료");
				System.out.print("메뉴 선택 : ");
				int menu = sc.nextInt();
				
				switch(menu) {
					case 1  : 
						System.out.println("방 번호 선택[1~"+count+"] : ");
						roomnum = sc.nextInt()-1;
							if(room[roomnum]==true) {
								System.out.println("방이 사용중입니다.");
							}else {
								System.out.println("입실 처리 완료");
								room[roomnum]=true;
							}
						break;
					case 2 : 
						System.out.println("방 번호 선택[1~"+count+"] : ");
						roomnum = sc.nextInt()-1;
							if(room[roomnum]==false) {
									System.out.println("방이 비어있습니다.");
								}else {
									System.out.println("퇴실 처리 완료");
									room[roomnum]=false;}
						break;
					case 3 : 
						for(int i = 0;i<room.length;i++) {
							if(room[i] == false ) { o1 = "빈방";							
							}else { o1 = "사용중";}
							System.out.println((i+1)+"번방은 "+o1+"입니다.");
						}
						break ;
					case 0 : 
						System.out.println("종료합니다.");
						break;
						
					default :
							System.out.println("없는 메뉴 입니다.");
						break;
				}
					
			if (menu ==0 ) {
				break;
			}			
		}
	}
}
