package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	public int menu() {
		System.out.println("1. 성적 입력\n2. 성적 검색 \n3. 성적 출력\n4. 성적수정\n5. 성적삭제\n0. 종료");
		System.out.print("메뉴선택 : ");
		int menu = sc.nextInt();
		return menu;
	}
	public Student input() {
		Student s = new Student();
		
		System.out.print("이름 입력 : ");
		s.setName(sc.next());
		System.out.print("국어점수 입력 : ");
		s.setKor(sc.nextInt());
		System.out.print("영어점수 입력 : ");
		s.setEng(sc.nextInt());
		System.out.print("수학점수 입력 : ");
		s.setMath(sc.nextInt());
		
		return s;
	}
	
	public boolean serch(List<Student> list) {
		System.out.print("검색할 이름 입력 : ");
		String name =sc.next();
		
		for(Student s : list) {// 가지고 있는 리스트 수량만큼 반복
			if(name.equals(s.getName())) {
				System.out.println("이름 : "+ s.getName());
				System.out.println("국어 : "+ s.getKor());
				System.out.println("영어 : "+ s.getEng());
				System.out.println("수학 : "+ s.getMath());
				System.out.println("총점 : "+ s.getSum());
				System.out.println("평균 : "+ s.getAvg());
				return false;
				
			}
		}
		return true;
	}
	public void ouput(List<Student> list) {
		System.out.println("=============전체출력================");
		for(Student s : list) {
			System.out.println("이름 : "+ s.getName());
			System.out.println("총점 : "+ s.getSum());
			System.out.println("평균 : "+ s.getAvg());
		}
	}
	public boolean modify(List<Student> list) {
		System.out.print("수정할 이름 입력 : ");
		String name =sc.next();
		
		for(Student s :list) {
			if(name.equals(s.getName())) {
				System.out.print("이름 수정 : ");
				s.setName(sc.next());
				System.out.print("국어 점수 수정 : ");
				s.setKor(sc.nextInt());
				System.out.print("영어 점수 수정 : ");
				s.setEng(sc.nextInt());
				System.out.print("수학 점수 수정 : ");
				s.setMath(sc.nextInt());
				return false;
			}
		}return true;
		
	}
	public boolean remove(List<Student>list) {
		System.out.print("삭제할 이름 입력 : ");
		String name =sc.next();
		
//		int i = 0;
		for(Student s :list) {
			if(name.equals(s.getName())) {
				System.out.println(s.getName()+"정보를 삭제합니다.");
//				list.remove(i);
				list.remove(s);
				return false;
			}
//			i++;
		}return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

