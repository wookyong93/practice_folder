package Quiz05;

import java.util.Scanner;

public class StudentMenu {
	Scanner sc = new Scanner(System.in);
	public int menu() {
		System.out.println("1. �л��Է�\n2. �л����\n3. ��ü�л�����\n0. ����");
		System.out.print("�޴� ���� : ");
		int menu =sc.nextInt();
		return menu;
	}
	
	public Student studentInput(int num) {
		Student student = new Student();
		
		student.setSnum(num+1001);
		System.out.print(student.getSnum()+"�� �л� �̸� �Է� : ");
		student.setName(sc.next());
		System.out.print(student.getSnum()+"�� �л� �а� �Է� : ");
		student.setMa(sc.next());
		
		return student;
	}
	
	public void studentOutAll(Student[] student,int num) {
		for(int i = 0;i<num;i++) {
			System.out.println("====="+student[i].getSnum()+"�й�=====");
			System.out.println("�̸� : "+student[i].getName());
			System.out.println("�а� : "+student[i].getMa());
			}
	}
	public boolean studentSerch(Student[] student,int num) {
		System.out.println("�˻��� �й� �Է� : ");
       int tmp = sc.nextInt();
         for (int i = 0;i < num; i++) {
           if(tmp == student[i].getSnum()) {
              System.out.println(student[i].getSnum() + "�й�");
              System.out.println("�̸� : " + student[i].getName());
              System.out.println("�а� : " + student[i].getMa());
             return false;
           }
        }
         return true;
	}

	
	
}
