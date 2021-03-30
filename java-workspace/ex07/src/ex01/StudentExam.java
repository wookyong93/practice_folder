package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		StudentService se  = new StudentService();
		
		while(true) {
			int menu = se.menu();
			
			switch(menu) {
			case 1 :
				list.add(se.input());
				break;
			case 2 :
				if(list.isEmpty()) {//비어 있으면 true;
					//if(list.size() == 0)
					System.out.println("저장된 값이 없습니다.");
				}
				else if(se.serch(list)) {
					System.out.println("찾으시는 이름이 없습니다.");
				}
				break;
			case 3 :
				if(list.isEmpty()) {
					System.out.println("입력된 정보가 없습니다.");
				}else {
				se.ouput(list);
				}
				break;
			case 4 : 
				if(list.isEmpty()) {
					System.out.println("입력된 정보가 없습니다.");
				}
				else if(se.modify(list)) {
					System.out.println("수정하려는 이름이 없습니다.");
				}
				break;
			case 5 : if(list.isEmpty()) {
				System.out.println("입력된 정보가 없습니다.");
				}
				else if(se.remove(list)) {
					System.out.println("삭제할 이름이 없습니다.");
				}
				break;
			case 0: 
				System.out.println("프로그램 종료");
				return;
			default : 
				System.out.println("없는 메뉴 입니다.");
			}
		}
		
//		for(int i = 0 ; i<3;i++) {
//			Student s1 = new Student();// for 문 1회 실행될떄마다 새로운객체를 만든다.
//			System.out.println("이름 : ");
//			s1.setName(sc.next());
//			System.out.println("국어점수 : ");
//			s1.setKor(sc.nextInt());
//			System.out.println("영어점수 : ");
//			s1.setEng(sc.nextInt());
//			System.out.println("수학점수 : ");
//			s1.setMath(sc.nextInt());
//			
//			list.add(s1);
//		}


	}
		
}
