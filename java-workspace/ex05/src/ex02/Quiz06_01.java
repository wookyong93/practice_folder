package ex02;

import java.util.Scanner;

public class Quiz06_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주차 가능한 차량 수 입력 : ");
		int paking = sc.nextInt();
		String[] cars = new String[paking];
		int num =0;
		label: while(true) {	
		System.out.println("1. 주차\n2. 출차\n3. 주차 현황\n0. 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
				switch(menu) {
				case 1 : 
					System.out.print("주차할 공간 번호 : ");
					num = sc.nextInt()-1;
					if(num<=paking) {
						if(cars[num] == null) {
						System.out.print("주차할 차량 번호 : ");
						cars[num] = sc.next();
						}else {
						System.out.println("주차할 공간에 주차된 차량이 있습니다.");
						}
					}else {
						System.out.println("없는 공간 번호 입니다.");
					}
					break;
				case 2 : 
					System.out.print("주차할 공간 번호 : ");
					num = sc.nextInt()-1;
					if(num<=paking) {
						if(cars[num] != null) {
						System.out.print("주차한 차량 번호 : ");
						String carnum = sc.next();
							if(cars[num].equals(carnum)) {
								System.out.println(cars[num] + "차량이 출차합니다.");
								cars[num] = null;
							}else if (!cars[num].equals(carnum)) {
								System.out.println("없는 차량 번호입니다. 확인해주세요.");
							}
						}else {
						System.out.println("주차할 공간에 주차된 차량이 없습니다.");
						}
					}else {
						System.out.println("없는 공간 번호 입니다.");
					}
					break;
				case 3 : 
					for(int i =0 ; i< paking;i++) {
						if(cars[i]!= null ) {
							System.out.println((i+1)+"번째 입고된 차량 : "+cars[i]);
						}else if (cars[i] == null) {
							System.out.println((i+1)+"번재 입고된 차량 : 없습니다.");
						}
					}
					break;
				case 0 : 
					System.out.println("종료됩니다.");
					break label;
					default :
						System.out.println("없는 메뉴입니다.");
				}
				
		}
	}
}
