package Quiz03;

import java.util.Scanner;

public class Student extends User {
		
	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.print("�л� �̸� �Է� : ");
		setName(sc.next());
		System.out.print("�л� ���� �Է� : ");
		setAge(sc.nextInt());
		System.out.print("�л� �ּ� �Է� : ");
		setAddr(sc.next());
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("�л� ����");
		System.out.println("�л� �̸� : "+getName());
		System.out.println("�л� ���� : "+getAge());
		System.out.println("�л� �ּ� : "+getAddr());
		
	}
	
}
