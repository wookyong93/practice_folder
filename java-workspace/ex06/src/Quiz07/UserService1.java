package Quiz07;

import java.util.Scanner;

public class UserService1 {
	Scanner sc = new Scanner(System.in);//�Է��� �����ִ� ��ü
	public int menu() {// �޴������� �ؼ� ���õ� ��ȣ�� exam���� �������ش�.
		
		System.out.println("1. �Է�\n2. �˻�\n3. ���\n0. ����"); // �޴� ��� 
		System.out.print("�޴� ���� : ");// �޴����� ���
		int menu =sc.nextInt();//�޴���ȣ�� �Է�
		return menu;//�޴���ȣ��  menu()ȣ���� exam���� ����
	}
	public UserInfo input(int num) {//�Էµ� ����������� exam���� �������ش�.
		UserInfo  ui = new UserInfo();
		System.out.print("����� �̸� �Է� : ");
		ui.setName(sc.next());
		System.out.print("����� ���̵� �Է� : ");
		ui.setId(sc.next());
		System.out.print("����� ��ȣ �Է� : ");
		ui.setPwd(sc.next());
		System.out.print("����� �̸��� �Է� : ");
		ui.setAdr(sc.next());
		
		return ui; //�Է� �� ��� ������ ���� UserInfo�� ��ü�� exam �� �����Ѵ�.
	}
	public boolean serch(UserInfo[] ui,int num) {//����� ������� , �Է°����� �޾Ƽ� �˻��Ѵ�.
		System.out.print("�˻��� ���̵� �Է� : ");
		String sid  = sc.next();
		
			for(int i =0 ; i<num;i++) {
				if(ui[i].getId().equals(sid)) {// �˻��� ���̵� ���� ��� 
					System.out.println("�̸� : "+ui[i].getName());
					System.out.println("���̵� : "+ui[i].getId());
					System.out.println("��ȣ : "+ui[i].getPwd());
					System.out.println("�̸��� : "+ui[i].getAdr());
					return false;
					}
			}
			return true; // �˻��� ���̵� ���� ��� 
	}
	public void output(UserInfo[] ui,int num) {//void �� �����Ҳ����°�쿡 ��� // ��� ����������� �Է°����� �̿��ؼ� ��� ���� ���;
		for(int i = 0;i<num;i++) {
			System.out.println("����� �̸� : "+ui[i].getName());
			System.out.println("����� ���̵� : "+ui[i].getId());
			System.out.println("����� ��ȣ : "+ui[i].getPwd());
			System.out.println("����� �̸��� : "+ui[i].getAdr());
			System.out.println("================================");
		}
	}
}
