package ex03;

import java.util.Scanner;

public class Quiz02_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
//		if(num%6 == 2 || num%6 == 4) =(num%2 == 0){
//				System.out.println("2�� ����Դϴ�.");
//			}else if(num%6 == 3){
//				System.out.println("3�� ����Դϴ�.");
//			}else if(num%6 == 0) {
//				System.out.println("2�� 3�� ����Դϴ�.");
//			}else {
//				System.out.println("2�� 3�� ������ƴմϴ�.");
//			}
		if(num%6 ==0) {
			System.out.println("2�� 3�� ����Դϴ�.");
		}else if (num%2 == 0) {
			System.out.println("2�� ����Դϴ�.");
		}else if (num%3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		}else {
			System.out.println("2�� 3�� ����� �ƴմϴ�.");
		}
	}
}
