package ex05;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu =0;
		int kor = 0;
		int eng = 0;
		int meth = 0;
		String name = null;
		boolean f1 = false;
		while(true) {
			System.out.println("1. 점수 입력 \n2. 점수 출력\n0. 프로그램 종료 ");
			System.out.println("===================");
			System.out.print("메뉴 선택 : ");
			menu =sc.nextInt();
				switch (menu){
					case 1 : 
						do {
							if(f1) {
								System.out.println("입력점수의 범위가 벗어났습니다. \n[0~100]의범위로 재 입력 해주세요.");
							}
							System.out.print("이름 입력 : ");
							name = sc.next();
							System.out.print("국어 점수 입력 : ");
							kor = sc.nextInt();
							}while(kor>100 || kor <0);
						do {
							if(f1) {
								System.out.println("입력점수의 범위가 벗어났습니다. \n[0~100]의범위로 재 입력 해주세요.");
								}
							System.out.print("영어 점수 입력 : ");
							eng = sc.nextInt();
							}while(eng >100 || eng <0);
						do {
							if(f1) {
								System.out.println("입력점수의 범위가 벗어났습니다. \n[0~100]의범위로 재 입력 해주세요.");
								}
							System.out.print("수학 점수 입력 : ");
							meth = sc.nextInt();
						}while(meth>100 || meth <0);
							
						break;
						
					case 2 : 
						System.out.println("이름 : " + name );
						System.out.println("총점 : "+(kor+eng+meth));
						System.out.printf("평균 : %.2f \n",((double)(kor+eng+meth)/3));
						System.out.println("출 력 완 료 ");
						break;
					
					default : 
						System.out.println("범위가 벗어났습니다.\n재 선택 해주세요.");
						break;
				}	
			if(menu ==0 ) {
				System.out.println("프로그램 종료");
				break;
			}
		}	
	}
}
