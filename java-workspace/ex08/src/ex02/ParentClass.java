package ex02;

import java.util.Scanner;

public class ParentClass {
	int kor;
	int eng;
	int math;
	Scanner sc = new Scanner(System.in);
	
	public void inPut() {
		System.out.print("국어 점수 입력 : ");
		this.kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		this.eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		this.math = sc.nextInt();
	}
	public void output() {
		System.out.println("국어 : "+this.kor);
		System.out.println("영어 : "+this.eng);
		System.out.println("수학 : "+this.math);
	}
	
}
