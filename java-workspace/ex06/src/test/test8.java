package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<Student>();
		for(int i = 0 ; i<3;i++) {
			Student s = new Student();// for 문 1회 실행될떄마다 새로운객체를 만든다.
			System.out.println("이름 : ");
			s.setName(sc.next());
			System.out.println("나이 : ");
			s.setAge(sc.nextInt());
			
			list.add(s);
		}
		for(Student s : list) {
			System.out.println("이름 : "+s.getName());
			System.out.println("나이 : "+s.getAge());
		}
	}
}
