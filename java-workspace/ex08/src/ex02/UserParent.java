package ex02;

import java.util.Scanner;

public class UserParent {
	String name;
	int age;
	String addr;
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.println("이름 입력 : ");
		this.name = sc.next();
		System.out.println("나이 입력 : ");
		this.age = sc.nextInt();
		System.out.println("주소 입력 : ");
		this.addr = sc.next();
		
	}
	public void output() {
		System.out.println("이름 : "+this.name);
		System.out.println("나이 : "+this.age);
		System.out.println("주소 : "+this.addr);
	}
}
