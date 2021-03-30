package ex02;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주차가능한 총 대수 입력 : ");
		int count =sc.nextInt();
		boolean[] car = new boolean[count];
		String[] carNum= new String [count];
		String carns =null;
		int num =0;
	finish :while(true) {
			System.out.println("주차장 프로그램");
			System.out.println("1. 주차\n2. 출차\n3. 주차장 정보\n0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			switch(menu) {
				case 1 :
					System.out.print("주차 공간 선택 [1~"+count+"] : ");
						num = sc.nextInt()-1;
					if(num <= count) {
						if(car[num] == false ) {
							System.out.println("주차 공간이 비었습니다. 주차 가능합니다.");
							System.out.print("차량 번호 를 입력 : ");
							carNum[num] = sc.next();
							car[num] = true;
							System.out.println("주차가 완료되었습니다.");
						}else {
							System.out.println("주차공간이 사용중입니다. 다른곳에 주차하세요.");
						}
					}else {
						System.out.println("없는 주차공간입니다.");
					}
					break;
				case 2 :
					System.out.print("주차 공간 선택 [1~"+count+"] : ");
					num = sc.nextInt()-1;
						if(num <= count) {
							if(car[num] == true ) {
								System.out.print("차량 번호 입력 : ");
								carns = sc.next();
								if(carNum[num].equals(carns)) {
								car[num] = false;
								System.out.println("출차가 완료 되었습니다.");
								} else {
								System.out.println("차량번호가 다릅니다 다시확인해주세요.");
								}
							}else {
								System.out.println("빈 주차 공간입니다. 다른곳을 확인해주세요 ");
							break;	
						}
						}else {
							System.out.println("없는 주차공간입니다.");
						}
					break ;
				case 3 : 
					for(int i = 0; i < count ;i++) {
						if(car[i] == true) {
						System.out.println((i+1)+"번 공간에 "+carNum[i]+"번 차량이 주차되어있습니다.");
						}else {
						System.out.println((i+1)+"번 공간은 빈 공간 입니다.");
						}	
					}
					break;
				case 0 : 
					System.out.println("프로그램이 종료 됩니다. ");
					break finish;
				default:
					System.out.println("메뉴를 잘못 선택 하셨습니다.");
				}
		}
	}
}
