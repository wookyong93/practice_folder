package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		for(int i = 0 ; i<3;i++) {
			Student s = new Student();// for �� 1ȸ ����ɋ����� ���οü�� �����.
			System.out.println("�̸� : ");
			s.setName(sc.next());
			System.out.println("���� : ");
			s.setAge(sc.nextInt());
			
			list.add(s);
		}
		for(Student s : list) {
			System.out.println("�̸� : "+s.getName());
			System.out.println("���� : "+s.getAge());
		}
	}
}
