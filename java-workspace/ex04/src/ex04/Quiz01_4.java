package ex04;

import java.util.Scanner;

public class Quiz01_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �Է� : ");
		 int num = sc.nextInt();
			for(int i = 1 ;i <= num ;i ++) {
				System.out.print('��');
			}
			System.out.println();
			System.out.print("�ݺ� Ƚ�� �Է� : ");
			int num1 = sc.nextInt();
			
			String H = "Hello";
			for(int i = 1 ; i <= num1 ; i++) {
			// int i = 1 :���� i<= num1 : �Է��Ѹ�ŭ�� �ݺ� i++ : �ݺ��Ҷ����� �ö󰡴� ���� 
				System.out.println(H);//1 ~ num1 ������ �ݺ� ���
				// ex > num =8 �̸� 8�� �ݺ� �Ǿ� ���;
			}
	}
}
