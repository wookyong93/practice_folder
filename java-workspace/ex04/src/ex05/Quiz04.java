package ex05;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		int in=0;
		Scanner sc = new Scanner(System.in);
	while(true) {	
		System.out.print("���� �Է� : ");
		int num =sc.nextInt();
		int i = 0;
			if(num >= 10) {
				while(num > 0) {
					i =num%10;
					System.out.print(i);
					num = num/10;
					if (num == 0) {
						System.out.println();
						System.out.print("�����Ϸ��� 0 �Է� : ");
						num =sc.nextInt();
						break;
					}
				}
			}else {
					System.out.println("���ڸ� ���� �Է��� �� �����ϴ�.");
			}
		}
	}
}

