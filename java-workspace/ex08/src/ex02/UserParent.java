package ex02;

import java.util.Scanner;

public class UserParent {
	String name;
	int age;
	String addr;
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.println("�̸� �Է� : ");
		this.name = sc.next();
		System.out.println("���� �Է� : ");
		this.age = sc.nextInt();
		System.out.println("�ּ� �Է� : ");
		this.addr = sc.next();
		
	}
	public void output() {
		System.out.println("�̸� : "+this.name);
		System.out.println("���� : "+this.age);
		System.out.println("�ּ� : "+this.addr);
	}
}
