package Quiz07;

import java.util.Scanner;

public class UserService {
	Scanner sc= new Scanner(System.in);
	public int menu() {
		System.out.println("1. ����� �Է�\n2. ����� �˻�\n3. ����� ���� ���\n0. ���α׷� ���� ");
		System.out.print("�޴����� : ");
		int menu =sc.nextInt();
		return menu;
	}
	public UserInfo input(int count) {
		UserInfo ui= new UserInfo();
		System.out.print("����� ����� �̸� �Է� : ");
		ui.setName(sc.next());
		System.out.print("����� ���̵� �Է� : ");
		ui.setId(sc.next());
		System.out.print("����� ��ȣ �Է� : ");
		ui.setPwd(sc.next());
		System.out.println("����� �̸��� �Է� : ");
		ui.setAdr(sc.next());
		return ui;
	}
	public boolean serch(UserInfo[] ui,int count) {
		System.out.print("�˻��� ������� ���̵� �Է��� : ");
		String sid = sc.next();
		boolean b1 =true;
			for(int i =0; i<count;i++) {
				if(ui[i].getId().equals(sid)) {
					System.out.println("����� �̸� : "+ui[i].getName());
					System.out.println("����� ���̵� : "+ui[i].getId());
					System.out.println("����� ��ȣ : "+ui[i].getPwd());
					System.out.println("����� �̸��� : "+ui[i].getAdr());
					b1 = false;
				}
			}return b1;
	}
	public void output(UserInfo[] ui,int count) {
		for(int i = 0 ; i <count;i++) {
			System.out.println("����� �̸� : "+ui[i].getName());
			System.out.println("����� ���̵� : "+ui[i].getId());
			System.out.println("����� ��ȣ : "+ui[i].getPwd());
			System.out.println("����� �̸��� : "+ui[i].getAdr());
			System.out.println("=========================================");
		}
	
	}

}
