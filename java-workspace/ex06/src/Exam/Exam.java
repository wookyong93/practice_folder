package Exam;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사양 등록 할 컴퓨터의 수 입력: ");
		int count =sc.nextInt();
		ExamInfor[] com = new ExamInfor[count];
		ExamFunc ec = new ExamFunc();
		int num =0;
main: while(true) {
		int menu = ec.menu();// ExamFunc 에서 메뉴의 값을 출력 받으므로 int menu의 그값을 입력;
		
		switch(menu){
		case 1 :
			if(num == count) {
				System.out.println("더 이상 저장할 수 없습니다.");
			}else {
				com[num] = ec.input(num);
				num++;
				}
			break;
		case 2 : 
			if(ec.serch(com, num))
				
				System.out.println("찾는 컴퓨터가 없습니다.");
			break;
		case 3 :
			ec.output(com, num);
			break;
		case 0 :
			System.out.println("프로그램 종료");
			break main;
		default:
			System.out.println("없는 메뉴 입니다.");
		}
		
		
		}
	}
}
