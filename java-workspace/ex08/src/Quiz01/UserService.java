package Quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
	Scanner sc = new Scanner(System.in);
	List<User> list = new ArrayList<>();
	
		public int menu() {
			System.out.println("1. ȸ������\n2. ȸ���˻�\n3. ȸ�����\n4. ȸ��Ż��\n0.���α׷� ����");
			System.out.print("�޴����� : ");
			int menu =sc.nextInt();
			return menu;
		}
		public User input(String id) {
			User u = new User();
			u.setId(id);
			System.out.print("PW �Է� : ");
			u.setPw(sc.next());
			System.out.print("�̸� �Է� : ");
			u.setName(sc.next());
			System.out.print("���� �Է� : ");
			u.setAge(sc.nextInt());
			System.out.print("�̸��� �Է� : ");
			u.setEmail(sc.next());
			return u;
		}
		public boolean serch(List<User> list) {
			System.out.print("�˻��� id �Է� : ");
			String id = sc.next();
				for(User u : list) {
					if(id.equals(u.getId())) {
						System.out.println("ID	     : " + u.getId());
						System.out.println("PW		 : " + u.getPw());
						System.out.println("�̸�		 : "+u.getName());
						System.out.println("���� 	 : "+u.getAge()+"��");
						System.out.println("�̸���	 : "+u.getEmail());
						return false;
					}
				}return true;
		}
		
		public boolean remove(List<User> list) {
			System.out.print("������ id �Է� : ");
			String id =sc.next();
				for(User u : list) {
					if(id.equals(u.getId())) {
						System.out.println("id : " + u.getId()+"�� ������ �����մϴ�.");
						list.remove(u);
					return false;
					}
					
				}
				return true;
		}
		
		
		
		
		public void output(List<User> list) {
			for(User u : list) {
				System.out.println("ID : " + u.getId());
				System.out.println("PW : " + u.getPw());
				System.out.println("�̸� : "+u.getName());
				System.out.println("���� : "+u.getAge()+"��");
				System.out.println("�̸��� : "+u.getEmail());
			}
		}
}
