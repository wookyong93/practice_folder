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
				if(list.isEmpty()) {//��� ������ true;
					//if(list.size() == 0)
					System.out.println("����� ���� �����ϴ�.");
				}
				else if(se.serch(list)) {
					System.out.println("ã���ô� �̸��� �����ϴ�.");
				}
				break;
			case 3 :
				if(list.isEmpty()) {
					System.out.println("�Էµ� ������ �����ϴ�.");
				}else {
				se.ouput(list);
				}
				break;
			case 4 : 
				if(list.isEmpty()) {
					System.out.println("�Էµ� ������ �����ϴ�.");
				}
				else if(se.modify(list)) {
					System.out.println("�����Ϸ��� �̸��� �����ϴ�.");
				}
				break;
			case 5 : if(list.isEmpty()) {
				System.out.println("�Էµ� ������ �����ϴ�.");
				}
				else if(se.remove(list)) {
					System.out.println("������ �̸��� �����ϴ�.");
				}
				break;
			case 0: 
				System.out.println("���α׷� ����");
				return;
			default : 
				System.out.println("���� �޴� �Դϴ�.");
			}
		}
		
//		for(int i = 0 ; i<3;i++) {
//			Student s1 = new Student();// for �� 1ȸ ����ɋ����� ���οü�� �����.
//			System.out.println("�̸� : ");
//			s1.setName(sc.next());
//			System.out.println("�������� : ");
//			s1.setKor(sc.nextInt());
//			System.out.println("�������� : ");
//			s1.setEng(sc.nextInt());
//			System.out.println("�������� : ");
//			s1.setMath(sc.nextInt());
//			
//			list.add(s1);
//		}


	}
		
}
