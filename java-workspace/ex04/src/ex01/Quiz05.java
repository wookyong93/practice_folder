package ex01;

public class Quiz05 {
	public static void main(String[] args) {
		int var = 55;
		if (var >= 0 && var <= 50) { // && ���� ���� �ǹ�
			System.out.println("����� ���� 0 ~ 50 �����Դϴ�.");
				if (var%3==0) {
				System.out.println("����� ���� 3�� ����Դϴ�.");
				}
				if (var%4==0) {
				System.out.println("����� ���� 4�� ����Դϴ�.");
				}
		}else {
			System.out.println("����� ���� "+var+"�Դϴ�.");
			}
	}
}
