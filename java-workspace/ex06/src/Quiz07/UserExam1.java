package Quiz07;

import java.util.Scanner;

public class UserExam1 {
	public static void main(String[] args) {
		UserInfo[] ui = new UserInfo[5];//����� ���� 5�� ������� ����
		Scanner sc = new Scanner(System.in);
		UserService1 us = new UserService1();
		int num=0;// ����� ���� �Է� ���� �����ϴ� ���� 
		while(true) {
			int menu = us.menu(); // �޴��� ������ �� ���� ����;
				switch (menu) {
				case 1 : //�Է�
					if(num == 5) {//num�� 5�� �ȴٴ� ���� �Է��� ������ ���ٴ� ��.
						System.out.println("�� �̻� ������ �� �����ϴ�.");
					}else {
						ui[num]=us.input(num);
						num++;//���ο� �������� ������ �� �ֵ��� �ε��� ��ȣ�� ���������ش�.
					}
					break;
				case 2 : //�˻�
					boolean b1 = us.serch(ui, num);//������� ��� ����, �Էµ� ������ �����Ͽ� �˻��� �ϵ��� �Ѵ�.
					if(b1) {
						System.out.println("ã�� ���̵� �����ϴ�.");
					}
					break;
				case 3 : //���
					if(num == 0 ) {//�Էµ� ������ ���� ��� ������� ȣ���� ���̴°� �����ϴ�.
						System.out.println("��ϵ� ����ڰ� �����ϴ�.");
					}else {
						us.output(ui, num); // ������� ������� , �Էµ� ������ �����ؼ� ��� ���� ���
					}
					break;
				case 0 : 
					System.out.println("���α׷� ����");
					
					return;
				default : 
					System.out.println("���� �޴� �Դϴ�.");
						
				}
			}
		}
	}


