package ex01;

public class quiz04 {
	public static void main(String[] args) {
		int date = 12;
		//�� = 1,8,15,22,29
		//ȭ = 2,9,16,23,30
		//�� = 3,10,17,24
		//�� = 4,11,18,25
		//�� = 5,12,19,26
		//�� = 6,13,20,27
		//�� = 7,14,21,28
		if (date%7 ==0) {
			System.out.println("������ �Ͽ��� �Դϴ�.");
		}else if (date%6 ==0 ) {
			System.out.println("������ ����� �Դϴ�.");
		}else if (date%5 ==0) {
			System.out.println("������ �ݿ��� �Դϴ�.");
		}else if (date%4 ==0) {
			System.out.println("������ ����� �Դϴ�.");
		}else if (date%3 ==0) {
			System.out.println("������ ������ �Դϴ�.");
		}else if (date%2 ==0) {
			System.out.println("������ ȭ���� �Դϴ�.");
		}else {
			System.out.println("������ ������ �Դϴ�.");
		}
		//�������� ����~
		if (date%7==0) {
			System.out.println(date+"���� �Ͽ����Դϴ�.");
		}else if (date%7 ==1) {
			System.out.println(date+"���� �������Դϴ�.");
		}else if (date%7 ==2) {
			System.out.println(date+"���� ȭ�����Դϴ�.");
		}else if (date%7 ==3) {
			System.out.println(date+"���� �������Դϴ�.");
		}else if (date%7 ==4) {
			System.out.println(date+"���� ������Դϴ�.");
		}else if (date%7 ==5) {
			System.out.println(date+"���� �ݿ����Դϴ�.");
		}else if (date%7 ==6) {
			System.out.println(date+"���� ������Դϴ�.");
		}
		//���� �� 
		
	}
}
