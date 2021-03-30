package Quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentInfoImpl implements StudentInfo {
	
	Scanner sc = new Scanner(System.in);
	List <Student> list = new ArrayList<>();
	@Override
	public int menu() {
		// TODO Auto-generated method stub
		System.out.println("1. �л��Է�\n2. �л��˻� \n3. �л���� \n4. �л����� \n5.�л����� \n0.����");
		System.out.print("�޴����� : ");
		int menu = sc.nextInt();
		return menu;
	}

	@Override
	public void Input() {
		System.out.print("�й� �Է� : ");
			int num = sc.nextInt();
				if(list.size() != 0) {
					for(Student s : list) {
						if(s.getColnum() == num) {
							System.out.println("�ߺ��� �й� �Դϴ�.");
							return;
						}
					}
				}
			Student s= new Student();
			s.setColnum(num);
			System.out.print("�̸� �Է� : ");
			s.setName(sc.next());
			System.out.print("�г� �Է� : ");
			s.setYear(sc.nextInt());
			System.out.print("�������� �Է� : ");
			s.setMajor(sc.next());
			list.add(s);
		}

	@Override
	public void serch() {
		// TODO Auto-generated method stub
		if(list.isEmpty()) {
			System.out.println("�Էµ� ������ �����ϴ�.");
		}else {
		System.out.print("�˻��� �л� �й� �Է� : ");
			int var1 = sc.nextInt();
		
			for(Student s : list) {
				if(s.getColnum() == var1) {
					System.out.println("�й� : "+s.getColnum());
					System.out.println("�̸� : "+s.getName());
					System.out.println("�г� : "+s.getYear());
					System.out.println("�������� : "+ s.getMajor());
					return;
				}
			}System.out.println("�˻��ϴ� ����ڰ� �����ϴ�.");
		}
	}
	@Override
	public void outPut() {
		// TODO Auto-generated method stub
		if(list.isEmpty()) {
			System.out.println("��ϵ� �л��̾����ϴ�.");
		}else {
			for(Student s : list) {
				System.out.println("===== �л� ��� =====");
				System.out.println("�й� : "+s.getColnum());
				System.out.println("�̸� : "+s.getName());
				System.out.println("�г� : "+s.getYear());
				System.out.println("�������� : "+ s.getMajor());
			}
		}
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		if(list.isEmpty()) {
			System.out.println("�Էµ� ������ �����ϴ�.");
		}else {
		System.out.print("������ �л� �й� �Է� : ");
		int num = sc.nextInt();
					for(int i =0; i<list.size();i++) {
						if(list.get(i).getColnum()==num){
							System.out.println("�ش��й��� ������ �̸� �Է� : ");
							list.get(i).setName(sc.next());
							System.out.println("�ش��й��� ������ �г� �Է� : ");
							list.get(i).setYear(sc.nextInt());
							System.out.println("�ش��й��� ������ �������� �Է� : ");
							list.get(i).setMajor(sc.next());
							System.out.println("������ �Ϸ�Ǿ����ϴ�.");
							return;
						}
				}System.out.println("�˻��� �й��� �����ϴ�.");
			}
	}
	

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.print("������ �л� �й� �Է� : ");
		int num = sc.nextInt();
			for(Student s : list) {
				if(s.getColnum()==num) {
					System.out.println(s.getColnum()+"�й� �л��� ������ ���� �˴ϴ�.");
					
					list.remove(s);
					return;
				}
			}System.out.println("�˻��ϴ� ����ڰ� �����ϴ�.");
	}

}
