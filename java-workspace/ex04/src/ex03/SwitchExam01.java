package ex03;

import java.util.Scanner;

public class SwitchExam01 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int date =sc.nextInt();
		if(1<=date && 31<=date) {
			switch(date%7) {
			//��Ģ���� ���� ������ ������ ��������.
			case 1 :
				System.out.println("������");
				break;
			case 2 : 
				System.out.println("ȭ����");
				break;
			case 3 : 
				System.out.println("������");
				break;
			case 4 :
				System.out.println("�����");
				break;
			case 5 : 
				System.out.println("�ݿ���");
				break;
			case 6 :
				System.out.println("�����");
				break;
			case 0 : 
				System.out.println("�Ͽ���");
			}
		}else {
			System.out.println("���� ��¥ �Դϴ�.");
		}
	}
}
