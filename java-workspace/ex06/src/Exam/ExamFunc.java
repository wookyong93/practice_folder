package Exam;

import java.util.Scanner;

public class ExamFunc {
	
	Scanner sc = new Scanner(System.in);
	public int menu () {
		System.out.println("1. 입력\n2. 검색\n3. 출력\n0. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int menu =sc.nextInt();
		return menu;
		}
	public ExamInfor input(int num) {// 전체 공개 값을 저장할 클래스 이름 불러올 이름 설정
		ExamInfor exam = new ExamInfor();
		System.out.print("컴퓨터 이름 입력 : ");
		exam.setName(sc.next());
		System.out.print("컴퓨터 CPU 이름 입력 : ");
		exam.setCpu(sc.next());
		System.out.print("컴퓨터 RAM 용량 입력 : ");
		exam.setRam(sc.nextInt());
		System.out.print("컴퓨터 하드 용량 입력 : ");
		exam.setHd(sc.nextInt());
		return exam;
	}
	public boolean serch(ExamInfor[] com,int num) {
		System.out.print("검색할 컴퓨터 이름 입력 : ");
		String name=sc.next();
		boolean b1 = true;
			for(int i = 0 ; i<num;i++) {
				if(com[i].getName().equals(name)) {
					System.out.println("컴퓨터 이름 : "+com[i].getName());
					System.out.println("컴퓨터 CPU : "+com[i].getCpu());
					System.out.println("컴퓨터 RAM 용량 : "+com[i].getRam()+"GB");
					System.out.println("컴퓨터 HD 용량: "+com[i].getHd()+"GB");
					b1 = false;
				}
			}
			return b1;
		}
	public void output(ExamInfor[] com,int num) {
		for(int i=0;i<num;i++) {
			System.out.println("컴퓨터 이름 : "+com[i].getName());
			System.out.println("컴퓨터 CPU : "+com[i].getCpu());
			System.out.println("컴퓨터 RAM 용량 : "+com[i].getRam()+"GB");
			System.out.println("컴퓨터 HD 용량: "+com[i].getHd()+"GB");
			System.out.println("======================================");
		}
	}
	
}
