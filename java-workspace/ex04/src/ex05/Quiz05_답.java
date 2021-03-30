package ex05;

import java.util.Scanner;

public class Quiz05_답 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int menu =1;
	String name = null;
	int kor = 0;
	int eng = 0;
	int meth = 0;
	
	while(menu != 0) {
		System.out.println("1.점수입력\n2.점수출력\n0.종료");
		System.out.print("메뉴 선택 : ");
		menu =sc.nextInt();
		switch(menu) {
		case 1 :
			 System.out.println("\n=====입력=====");
			 //이름 , 국어 , 영어 , 수학 점수입력
			 System.out.print("이름 입력 : ");
			 name =sc.next();
			 do {
			 System.out.print("국어 점수 입력 : ");
			 kor = sc.nextInt();
			 }while(kor > 100 || kor <0);
			 do {
			 System.out.print("영어 점수 입력 : ");
			 eng = sc.nextInt();
			 }while(eng > 100 || eng <0);
			 do {
			 System.out.print("수학점수 입력 : ");
			 meth = sc.nextInt();
			 }while(meth>100 || meth<0);
			 break;
		case 2 : 
			System.out.println("\n=====출력=====");
			System.out.println("이름 : "+name);
			System.out.println("총점 : "+(kor+eng+meth)+"점");
			System.out.printf("평균 : %.2f 점\n",((kor+eng+meth)/3.0));
			break;
		case 0 : 
			System.out.println("프로그램 종료");
			break;
		default : 
			System.out.println("메뉴에 없는 번호 입니다.");
		}
	}
}
}
