package ex03;

import java.util.Scanner;

public class Quiz02_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		if(num != 0) {
		switch(num%6) {
			case 0 : 
				System.out.println("2�� 3�� ��� �Դϴ�.");
				break;
			case 2 :
			case 4 :
				System.out.println("2�� ��� �Դϴ�.");
				break;
			//���Ϲ��ڿ��� ����Ҷ� case ��ȣ�� �Ѵ� ���ټ��ִ�.
				
			case 3:
				System.out.println("3�� ��� �Դϴ�.");
				break;
			
			default:
				System.out.println("2�� 3�� ����� �ƴմϴ�.");
			}
		} else {
			System.out.println("0�� ����� �ƴմϴ�.");
		}
	
			switch(num%6) {
				case 0 : 
					if(num == 0) {
						System.out.println("0�� ����� �ƴմϴ�.");
					}else {
					System.out.println("2�� 3�� ��� �Դϴ�.");
					}
					break;
				case 2 :
				case 4 :
					System.out.println("2�� ��� �Դϴ�.");
					break;
				//���Ϲ��ڿ��� ����Ҷ� case ��ȣ�� �Ѵ� ���ټ��ִ�.
					
				case 3:
					System.out.println("3�� ��� �Դϴ�.");
					break;
				
				default:
					System.out.println("2�� 3�� ����� �ƴմϴ�.");
				}
		
	}
}
	