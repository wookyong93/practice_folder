package ex02;

import java.util.Scanner;

public class Quiz06_답 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주차가능한 차량 댓수 : ");
		int paking = sc.nextInt();
		boolean[] cars = new boolean[paking];
		String[] carName = new String [paking];
		//String 배열은 null로 초기화가 된다.
	label:	while(true) {
			System.out.println("1. 주차\n2. 출차\n3. 주차 현황\n0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
		switch(menu) { 	
		case 1 : 	
			//주차처리
		int tmp =0;
		do {
		System.out.print("주차할 공간 입력 [1 ~ " +paking+"] : ");
		tmp =sc.nextInt()-1;
		}while(tmp<0 || tmp>=paking);
			//인덱스 값가 맞추기위해서 -1 입력 1 => 인덱스 0 번이 열리게
			if(cars[tmp] == true) {
				System.out.println("사용중인 공간으로 주차할수 없습니다.");
			}else {
				System.out.print("차량번호 입력 : ");
				carName[tmp] = sc.next();
				cars[tmp] = true;
			}
			break;
		case 2 :
			//출차 처리
			
			System.out.print("출차할 차량 번호 입력 : ");
			String tmpname = sc.next();
				for(int i = 0; i<paking;i++) {
					boolean b1 = true;
					if(carName[i] == null) {
						continue;
					}
					else if(carName[i].equals(tmpname)) {
						System.out.println((i+1)+ "번 공간의 " +carName[i]+"번 차량이 출차합니다.");
						cars[i] =false;
						carName[i] = null;
						b1 = false;
						break;
					}
				if(b1) {
					System.out.println("찾으시는 번호가없습니다.");
					}
				}
				break;
		case 3 : 	
			for(int i = 0 ; i< paking ; i++) {
				if(cars[i] == true) {
				System.out.println((i+1)+"공간 주차 상황 : "+carName[i]+" 가 사용중입니다.");
				}else {
				System.out.println((i+1)+"공간 주차 상황 : 비어있습니다.");
				}
			
				}
			break;
		case 0 : 
			System.out.println("프로그램 종료 ");
			break label;
		default :
			System.out.println("없는 메뉴입니다. ");
			
			}	
		}	
	}
		
		
}
