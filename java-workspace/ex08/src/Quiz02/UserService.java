package Quiz02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
	
	List<User> list =new ArrayList<>();
	Scanner sc =new Scanner(System.in);
	public int menu() {
		System.out.println("1. ȸ������\n2. ȸ���˻�\n3. ȸ�����\n4. ȸ��Ż��\n5. ��üŻ��\n0. ���α׷�����");
		System.out.print("�޴����� : ");
		int menu = sc.nextInt();
		return menu;
	}
	public User input(List <User> list) {
		System.out.print("ID �Է� : ");
		String id = sc.next();
			if(list.size() != 0 ) {
				for(User u:list) {
					if(id.equals(u.getId())) {
						System.out.println("�ߺ��� ID �Դϴ�.");
						return null;
					}
				}
			}
			
				User u = new User();
				u.setId(id);
				System.out.print("PW �Է� : ");
				u.setPwd(sc.next());
				System.out.print("�̸� �Է� : ");
				u.setName(sc.next());
				System.out.print("���� �Է� : ");
				u.setAge(sc.nextInt());
				return u;
	}
	public void serch(List <User> list) {
		System.out.print("�˻��� �̸� : ");
		String name = sc.next();
			for(User u : list) {
				if(name.equals(u.getName())) {
					System.out.println("ID : "+u.getId());
					System.out.println("PW : "+u.getPwd());
					System.out.println("�̸� : "+u.getName());
					System.out.println("���� : "+u.getAge());
					return;
				}
			}System.out.println("ID�� ���� ���� �ʽ��ϴ�.");
	}
	public void output(List<User> list) {
		for(User u : list) {
			System.out.println("ID : "+u.getId());
			System.out.println("PW : "+u.getPwd());
			System.out.println("�̸� : "+u.getName());
			System.out.println("���� : "+u.getAge());
			System.out.println();
		}
		
	}
	public void delete(List<User> list) {
		System.out.println("������ ���̵� �Է� : ");
		String id = sc.next();
			for(User u : list) {
				if(id.equals(u.getId())) {
					System.out.println(id+"���� �����մϴ�.");
					list.remove(u);
					return;
				}
			}System.out.println("������ ID �� ã�� �� �����ϴ�.");
	}
	public void deleteAll(List<User> list){
		String select;
		do {
		System.out.println("��ü ���� �մϴ� . �����Ͻðڽ��ϱ� ? (y/n)");
		select = sc.next();
		if(select.equals("Y")|| select.equals("y")) {
			System.out.println("��ü ���� �մϴ�.");
			list.clear();
		}else if (select.equals("n")||select.equals("N")) {
			System.out.println("��ü������ ����մϴ�.");
		}else {
			System.out.println("�߸��� �����Դϴ�.");
		}
		}while(!select.equals("Y") && !select.equals("y") && !select.equals("n") && !select.equals("N"));
	}
	
}
