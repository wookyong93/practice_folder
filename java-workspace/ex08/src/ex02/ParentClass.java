package ex02;

import java.util.Scanner;

public class ParentClass {
	int kor;
	int eng;
	int math;
	Scanner sc = new Scanner(System.in);
	
	public void inPut() {
		System.out.print("���� ���� �Է� : ");
		this.kor = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		this.eng = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		this.math = sc.nextInt();
	}
	public void output() {
		System.out.println("���� : "+this.kor);
		System.out.println("���� : "+this.eng);
		System.out.println("���� : "+this.math);
	}
	
}
