package ex02;

import java.util.Scanner;

public class Quiz05_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�¾ �⵵�� �Է����ּ��� : ");
		int year = sc.nextInt();
			System.out.println("=====================================");
			int age = 2020 - year ;
			//���� ������ ������� �ʾƵ� �ȴ�.
			//int age = (2020-year)+1;
			System.out.println("����� ���� �� ���̴� "+age+"�� �Դϴ�.");
			//System.out.printf ("����� ���� ���̴� %d �� �Դϴ�.\n",age )
			//System.out.println("����� ���̴� " +(2020-year+1)+"�Դϴ�.");
			if (age >= 20) {
				System.out.println("�����Դϴ�.");
			}else {
				System.out.println("�̼������Դϴ�.");
			}
	}
}
