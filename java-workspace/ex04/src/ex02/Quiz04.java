package ex02;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t�޴� ����");
		System.out.println("======================");
		System.out.println("1. �ѽ�");
		System.out.println("2. �߽�");
		System.out.println("3. �Ͻ�");
		System.out.println("4. ���");
		System.out.println("======================");
		System.out.print("�����ϴ� ������ ? ");
		int select= sc.nextInt();
		
		String meuname =new String();
		if (select == 1 ) {
			//System.out.println("�����ϴ� ������ �ѽ��Դϴ�.");
			meuname = "�ѽ�";
		}else if(select == 2 ) {
			//System.out.println("�����ϴ� ������ �߽��Դϴ�.");
			meuname = "�߽�";
		}else if (select == 3) {
			//System.out.println("�����ϴ� ������ �Ͻ��Դϴ�.");
			meuname = "�Ͻ�";
		}else if (select == 4 ) {
			//System.out.println("�����ϴ� ������ ����Դϴ�.");
			meuname = "���";
		}else {
			System.out.println("�����Ͻ� ��ȣ�� �޴��� �����ϴ�.");
		}
		if(select >0 && select<=4) {
			System.out.println("�����ϴ� ������ "+meuname+" �Դϴ�.");
			//ex)�̷� ����� �ִ�
		} 
	}
}
