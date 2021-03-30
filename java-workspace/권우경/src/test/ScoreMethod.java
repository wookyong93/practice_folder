package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreMethod {
	List<Score> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public int menu() {
		System.out.println("=====메  뉴=====");
		System.out.println("1. 성적 입력\n2. 성적 검색\n3. 성적 출력\n0. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		return menu;
	}
	public Score inPut() {
		Score s = new Score();
		System.out.print("이름 입력 : ");
		s.setName(sc.next());
		System.out.print("국어 점수 입력 : ");
		s.setKor(sc.nextInt());
		System.out.print("영어 점수 입력 : ");
		s.setEng(sc.nextInt());
		System.out.print("수학 점수 입력 : ");
		s.setMath(sc.nextInt());
		
		return s;
	}
	public boolean serch(List<Score> list) {
		System.out.print("검색할 이름 입력 : ");
		String name = sc.next();
		for(Score s : list) {
			if(name.equals(s.getName())) {
				System.out.println("이름 : "+s.getName());
				System.out.println("국어 : "+s.getKor()+" 점");
				System.out.println("영어 : "+s.getEng()+" 점");
				System.out.println("수학 : "+s.getMath()+" 점");
				System.out.println("총점 : "+s.getSum()+" 점");
				System.out.printf("평균 : %.2f 점\n",s.getAvg());
				return false;
			}
		}return true;
	}
	public void outPut(List<Score> list) {
		for(Score s : list) {
			System.out.println("이름 : "+s.getName());
			System.out.println("총점 : "+s.getSum()+" 점");
			System.out.printf("평균 : %.2f 점\n",s.getAvg());
			System.out.println("===============");
		}
	}
}
