package Ex01;

import java.util.Scanner;



public class Exam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է� 2.��� 3. ����");
		int menu =sc.nextInt();
		
		switch(menu){
			case 1 :
				System.out.println("�Է�");
				break;
			case 2 : 
				System.out.println("���");
				break;
			case 3 : 
				System.out.println("����");
				break;
			default :
				System.out.println("�޴� ����");
		}
		
	}
}
