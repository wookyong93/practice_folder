package ex05;

import java.util.Scanner;

public class WhileExam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {//���ѹݺ��� ���� ���� 
			System.out.print("�����Ϸ��� 0 �Է� : ");
			int i=sc.nextInt();
			if(i ==0) {
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}
}
