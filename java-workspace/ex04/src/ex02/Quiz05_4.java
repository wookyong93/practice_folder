package ex02;

import java.util.Scanner;

public class Quiz05_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===================================");
		System.out.println("1. ����");
		System.out.println("2. ��⵵");
		System.out.println("3. ��û��");
		System.out.println("4. ���");
		System.out.println("5. ����");
		System.out.println("6. ������");
		System.out.println("7. ���ֵ�");
		//System.out.println("1.����\n2. ��⵵\n3. ��û��\n4. ���\n5. ����\n6. ������\n7. ������);
		//�����ϴ�
			System.out.println("===================================");
			System.out.print("����� ������ ?");
		int number = sc.nextInt();
			System.out.println("===================================");
		String con = new String();
		if(number >0 && number<8){ 
			if(number == 1) {
				con = "����";
			}else if (number == 2) {
				con = "��⵵";
			}else if (number == 3) {
				con = "��û��";
			}else if (number == 4) {
				con = "���";
			}else if (number == 5) {
				con = "����";
			}else if (number == 6) {
				con = "������";
			}else if (number == 7) {
				con = "���ֵ�";
			}
			System.out.printf("����� ������ %s�Դϴ�.\n",con);
		}else {
				System.out.println("�߸��� ������ȣ �Դϴ�.");
			}
			
	}
}
