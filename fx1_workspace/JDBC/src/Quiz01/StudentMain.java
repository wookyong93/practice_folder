package Quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		StudentService stuService = new StudentServiceImpl();
		List<Student> list  =new ArrayList<>();
		int num;
		boolean bl;
		while(true) {
			System.out.println("1. �л��Է� 2. �л����� 3. �л����� 4.�л� ��� 5.�л� �˻� 0.����");
			System.out.print("���� : ");
			int menu =sc.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.print("�й��Է� : ");
				student.setNum(sc.nextInt());
				bl = stuService.checknum(student.getNum());
				if(bl) {
					System.out.println("�ߺ��� �й��Դϴ�.");
				}else {
					System.out.print("�̸��Է� :");
					student.setName(sc.next());
					System.out.print("�а��Է� : ");
					student.setMajor(sc.next());
					System.out.print("�г��Է� : ");
					student.setYear(sc.nextInt());
					stuService.insert(student);
				}
				break;
			case 2 :
				if(stuService.checkMember()) {
				System.out.print("������ �й� �˻� : ");
				student.setNum(sc.nextInt());
				bl = stuService.checknum(student.getNum());
				if(bl) {
					System.out.print("�̸��Է� :");
					student.setName(sc.next());
					System.out.print("�а��Է� : ");
					student.setMajor(sc.next());
					System.out.print("�г��Է� : ");
					student.setYear(sc.nextInt());
					
					stuService.update(student);
				}else {
					System.out.println("�˻��� �й��� �����ϴ�.");
				}
				}else {System.out.println("����� �л��� �����ϴ�.");}
				break;
			case 3 :
				if(stuService.checkMember()) {
				System.out.print("������ �й� �Է� : ");
				num = sc.nextInt();
				bl =stuService.checknum(num);
				if(bl) {
					stuService.delete(num);
				}else {
					System.out.println("�˻��� �й��� �����ϴ�.");
				}
				}else {System.out.println("����� �л��� �����ϴ�.");}
				break;
			case 4 :
				list = stuService.select();
				if(list.size() !=0) {
					for(Student s : list) {
						System.out.println("�й� : "+s.getNum());
						System.out.println("�̸� : "+s.getName());
						System.out.println("�а� : "+s.getMajor());
						System.out.println("�г� : "+s.getYear());
					}
					
				}else {
						System.out.println("�Էµ� �л��� �����ϴ�.");
					}
				
				break;
			case 5 : if(stuService.checkMember()) {
				System.out.print("�˻��� �й� �Է� : ");
				num =sc.nextInt();
				stuService.search(num);
				}else {
					System.out.println("����� �л��� �����ϴ�.");
				}
				break;
			case 0 :
				System.out.println("���α׷��� ����˴ϴ�.");
				return;
			default :
				System.out.println("���� �޴��Դϴ�.");
				
			}
		}
		
	}
}