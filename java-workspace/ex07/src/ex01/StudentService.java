package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
	Scanner sc = new Scanner(System.in);
	public int menu() {
		System.out.println("1. ���� �Է�\n2. ���� �˻� \n3. ���� ���\n4. ��������\n5. ��������\n0. ����");
		System.out.print("�޴����� : ");
		int menu = sc.nextInt();
		return menu;
	}
	public Student input() {
		Student s = new Student();
		
		System.out.print("�̸� �Է� : ");
		s.setName(sc.next());
		System.out.print("�������� �Է� : ");
		s.setKor(sc.nextInt());
		System.out.print("�������� �Է� : ");
		s.setEng(sc.nextInt());
		System.out.print("�������� �Է� : ");
		s.setMath(sc.nextInt());
		
		return s;
	}
	
	public boolean serch(List<Student> list) {
		System.out.print("�˻��� �̸� �Է� : ");
		String name =sc.next();
		
		for(Student s : list) {// ������ �ִ� ����Ʈ ������ŭ �ݺ�
			if(name.equals(s.getName())) {
				System.out.println("�̸� : "+ s.getName());
				System.out.println("���� : "+ s.getKor());
				System.out.println("���� : "+ s.getEng());
				System.out.println("���� : "+ s.getMath());
				System.out.println("���� : "+ s.getSum());
				System.out.println("��� : "+ s.getAvg());
				return false;
				
			}
		}
		return true;
	}
	public void ouput(List<Student> list) {
		System.out.println("=============��ü���================");
		for(Student s : list) {
			System.out.println("�̸� : "+ s.getName());
			System.out.println("���� : "+ s.getSum());
			System.out.println("��� : "+ s.getAvg());
		}
	}
	public boolean modify(List<Student> list) {
		System.out.print("������ �̸� �Է� : ");
		String name =sc.next();
		
		for(Student s :list) {
			if(name.equals(s.getName())) {
				System.out.print("�̸� ���� : ");
				s.setName(sc.next());
				System.out.print("���� ���� ���� : ");
				s.setKor(sc.nextInt());
				System.out.print("���� ���� ���� : ");
				s.setEng(sc.nextInt());
				System.out.print("���� ���� ���� : ");
				s.setMath(sc.nextInt());
				return false;
			}
		}return true;
		
	}
	public boolean remove(List<Student>list) {
		System.out.print("������ �̸� �Է� : ");
		String name =sc.next();
		
//		int i = 0;
		for(Student s :list) {
			if(name.equals(s.getName())) {
				System.out.println(s.getName()+"������ �����մϴ�.");
//				list.remove(i);
				list.remove(s);
				return false;
			}
//			i++;
		}return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

