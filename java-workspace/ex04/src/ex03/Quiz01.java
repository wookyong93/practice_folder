package ex03;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ����\n2. �޸���\n3. ����ã��\n4. Ķ����");
		System.out.print("����� ���� ��ȣ�� �Է����ּ��� : ");
		int num =sc.nextInt();
		//		if =���࿡ �ʿ��� ������ �����ΰ�� 
		//		switch=���࿡ �ʿ��� ������ ���� ���
		String name =null;
		switch(num) {
			case 1 :
				name = "����";
				System.out.println("���⸦ �����մϴ�.");
				// �������� ���� break�� ������ ���� �������.
				break;
			case 2 : 
				name = "�޸���";
				System.out.println("�޸����� �����մϴ�.");
				break;
			case 3 : 
				name = "����ã��";
				System.out.println("����ã�⸦ �����մϴ�.");
				break;
			case 4 : 
				name = "Ķ����";
				System.out.println("Ķ������ �����մϴ�.");
			default :
				System.out.println("������ ���� ��ȣ�� �����ϴ�.");
			// default �� case ���� �ش�Ǵ°� ���� ����� ���� ǥ��
			}
		System.out.printf("%s�� �����մϴ�.",name);
//			String menu = "";
//		if(num==1) {
//			menu = "����";
//		}else if (num ==2) {
//			menu = "�޸���";
//		}else if (num ==3) {
//			menu = "����ã��";
//		}else if (num ==4) {
//			menu = "Ķ����";
//		}else {
//			System.out.println("�߸��� �۹�ȣ �Դϴ�.");
//		}	
//		System.out.printf("%s�� �����մϴ�.",menu);
//	
	
	}

}
