package ex02;

import java.util.Scanner;

public class ArrayExam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("호텔의 방의 갯수 : ");
		int room = sc.nextInt(); // room 의 수
		
		boolean[] roomnum = new boolean [room]; //room의 상태
		//false  : 비어있는 방 / true : 사용중인 방
		roomnum[1] =  true; // 입실
		
		for(int i = 0 ; i<room ;i++) {
			if(roomnum[i] == true) {
				System.out.println((i+1)+"방은 사용 중입니다.");
			}else {
				System.out.println((i+1)+"방은 비어 있습니다.");
			}
		}
		
		roomnum[1] =  false;
		//퇴실
		for(int i = 0 ; i<room ;i++) {
			if(roomnum[i] == true) {
				System.out.println((i+1)+"방은 사용 중입니다.");
			}else {
				System.out.println((i+1)+"방은 비어 있습니다.");
			}
		}
	}
}
