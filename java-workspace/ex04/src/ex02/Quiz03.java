package ex02;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int var1 = sc.nextInt();
		
		if (var1 > 0 ) {
			System.out.println("�Է��Ͻ� ���� ��� �Դϴ�.");
		}else if(var1 < 0) {
			System.out.println("�Է��Ͻ� ���� ���� �Դϴ�.");	
		}else if(var1 == 0) {
			System.out.println("�Է��Ͻ� 0�� ����� ������ �ƴմϴ�.");
		}

	}
	
}
