package ex05;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cf = 250;
		int ym = 200;
		int co = 150;
		int coin = 0;
			while(true) {
				System.out.print("�ݾ� �Է� : ");
				 coin = sc.nextInt();
				 System.out.println("====�޴�====");
				 System.out.printf("1. Ŀ��[%d]\n2. ������[%d]\n3. ���ھ�[%d]\n4. �ݾ׹�ȯ\n",cf,ym,co);
				 System.out.print("�޴� ���� : ");
				 int menu =sc.nextInt();
				 	switch(menu){
				 		case 1 :
				 				if(coin <cf) {
				 					System.out.println("�ݾ��� ���ڸ��ϴ�.");
				 					System.out.println("��ȯ�ݾ� : "+coin);
				 				break;
				 				}else {
				 					System.out.println("Ŀ�ǰ� ���Խ��ϴ�.");
				 					System.out.println("��ȯ�ݾ� : " +(coin-cf));
				 				break;}
			 			case 2 :
			 					if(coin <ym) {
				 					System.out.println("�ݾ��� ���ڸ��ϴ�.");
				 					System.out.println("��ȯ�ݾ� : "+coin);
				 				break;
				 				}else {
				 					System.out.println("�������� ���Խ��ϴ�.");
				 					System.out.println("��ȯ�ݾ� : " +(coin-ym));
				 				break;}
				 		case 3 :
				 				if(coin <co) {
				 					System.out.println("�ݾ��� ���ڸ��ϴ�.");
				 					System.out.println("��ȯ�ݾ� : "+coin);
				 				break;
				 				}else {
				 					System.out.println("���ھư� ���Խ��ϴ�.");
				 					System.out.println("��ȯ�ݾ� : " +(coin-co));
				 				break;}
			 			case 4 :
			 				System.out.println("�ݾ��� ��ȯ�˴ϴ�.");
			 				System.out.println("��ȯ�ݾ� : " + coin);
			 				break;
				 		default : 
				 			System.out.println("���� �޴��Դϴ�.");
				 			System.out.println("��ȯ�ݾ� : "+coin);
				 		 	}
				 System.out.println();	
				 }
			 		
			
	}
}
